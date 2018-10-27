package Logic;

import java.sql.Timestamp;

// Our Domain Database Table will exactly look like this class

public class Domain {

    private String domainHash;
    private String domianUrl;
    private boolean activated;
    private Timestamp modified;

    // We will need 2 Constructor .....One for Basic Construction and Other for Setting Private Properties

    // For Setting Basic Construction
    public Domain(String domainHash, String domianUrl) {
        this.domainHash = domainHash;
        this.domianUrl = domianUrl;
    }

    // For Setting Private Properties.......Will be Used when Data will be set by Database
    public Domain(String domainHash, String domianUrl, boolean activated, Timestamp modified, Timestamp created) {
        this.domainHash = domainHash;
        this.domianUrl = domianUrl;
        this.activated = activated;
        this.modified = modified;
        this.created = created;
    }

    public String getDomainHash() {
        return domainHash;
    }

    public String getDomianUrl() {
        return domianUrl;
    }

    public boolean isActivated() {
        return activated;
    }

    public Timestamp getModified() {
        return modified;
    }

    public Timestamp getCreated() {
        return created;
    }

    private Timestamp created;
}
