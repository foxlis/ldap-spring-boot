package foxlis.ldap.repository;

import java.util.List;

import javax.naming.ldap.LdapName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.support.LdapNameBuilder;
import org.springframework.stereotype.Component;

import foxlis.ldap.domain.Person;
import foxlis.ldap.mapper.PersonAttributesMapper;

import static org.springframework.ldap.query.LdapQueryBuilder.query;

/**
 * Created by boli on 2017-02-20.
 */
@Component
public class PersonRepositoryImpl implements PersonRepository {

  public final String BASE_DN = "dc=isc,dc=com;";

  @Autowired
  private LdapTemplate ldapTemplate;

  @Override
  public Person findDn(String dn) {

    LdapName ldapName = LdapNameBuilder.newInstance(BASE_DN)
        .add("cn", "group")
        .build();

    return ldapTemplate.lookup(ldapName, new PersonAttributesMapper());
  }

  public List<Person> getAllPersons() {
    return ldapTemplate.search(query().where("objectclass").is("person"), new PersonAttributesMapper());
  }

}
