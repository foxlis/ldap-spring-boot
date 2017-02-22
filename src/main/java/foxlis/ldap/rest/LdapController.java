package foxlis.ldap.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import foxlis.ldap.domain.Group;
import foxlis.ldap.domain.Person;
import foxlis.ldap.repository.GroupRepository;
import foxlis.ldap.repository.PersonRepository;

@RestController
public class LdapController {

  @Autowired
  private PersonRepository personRepository;

  @Autowired
  private GroupRepository groupRepository;

  @RequestMapping("/groups")
  public ResponseEntity<List<Group>> groups() {

    List<Group> groups = groupRepository.getAllGroups();

    return new ResponseEntity<List<Group>>(groups, HttpStatus.OK);
  }

  @RequestMapping(method = RequestMethod.GET, value = "/dn")
  public ResponseEntity<Person> persons(@RequestParam("dn") final String dn) {

    Person persons = personRepository.findDn(dn);

    return new ResponseEntity<Person>(persons, HttpStatus.OK);
  }

  @RequestMapping("/persons")
  public ResponseEntity<List<Person>> persons() {

    List<Person> persons = personRepository.getAllPersons();

    return new ResponseEntity<List<Person>>(persons, HttpStatus.OK);
  }
}
