package foxlis.ldap.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by boli on 2017-02-21.
 */
@ConfigurationProperties(prefix = "ldap")
public class LdapProperties {

  private String url;

  private String userDn;

  private String password;

  private String base;

  private String clean;

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getUserDn() {
    return userDn;
  }

  public void setUserDn(String userDn) {
    this.userDn = userDn;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getBase() {
    return base;
  }

  public void setBase(String base) {
    this.base = base;
  }

  public String getClean() {
    return clean;
  }

  public void setClean(String clean) {
    this.clean = clean;
  }
}
