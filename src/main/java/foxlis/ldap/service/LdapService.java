package foxlis.ldap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import foxlis.ldap.repository.PersonRepository;

/**
 * Created by boli on 2017-02-21.
 */
@Service
public class LdapService {

  @Autowired
  PersonRepository personRepository;

}
