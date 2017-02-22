package foxlis.ldap.mapper;

import javax.naming.NamingException;
import javax.naming.directory.Attributes;

import org.springframework.ldap.core.AttributesMapper;

import foxlis.ldap.domain.Group;

/**
 * Created by boli on 2017-02-21.
 */
public class GroupAttributesMapper implements AttributesMapper<Group> {

  public Group mapFromAttributes(Attributes attrs) throws NamingException {
    Group group = new Group();

    //group.setName((String)attrs.get("cn").get());

    return group;
  }

}