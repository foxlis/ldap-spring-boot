package foxlis.ldap.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.LdapContextSource;

/**
 * Created by boli on 2017-02-20.
 */
@Configuration
public class LdapConfiguration {

  @Autowired
  LdapProperties ldapProperties;

  @Bean
  public LdapContextSource contextSource() {

    LdapContextSource contextSource = new LdapContextSource();

    contextSource.setUrl(ldapProperties.getUrl());
    contextSource.setBase(ldapProperties.getBase());
    contextSource.setUserDn(ldapProperties.getUserDn());
    contextSource.setPassword(ldapProperties.getPassword());

    return contextSource;
  }

  @Bean
  public LdapTemplate ldapTemplate() {
    return new LdapTemplate(contextSource());
  }

}
