package foxlis.ldap.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import foxlis.ldap.domain.Person;

/**
 * Created by boli on 2017-02-20.
 */
@Component
public interface PersonRepository {

  Person findDn(String dn);

  List<Person> getAllPersons();

}
