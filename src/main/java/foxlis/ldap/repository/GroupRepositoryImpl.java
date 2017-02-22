package foxlis.ldap.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.stereotype.Component;

import foxlis.ldap.domain.Group;
import foxlis.ldap.mapper.GroupAttributesMapper;

import static org.springframework.ldap.query.LdapQueryBuilder.query;

/**
 * Created by boli on 2017-02-20.
 */
@Component
public class GroupRepositoryImpl implements GroupRepository {

  public final String BASE_DN = "dc=isc,dc=com;";

  @Autowired
  private LdapTemplate ldapTemplate;

  @Override
  public List<Group> getAllGroups() {
    return ldapTemplate.search(query().where("objectclass").is("group"), new GroupAttributesMapper());
  }
}
