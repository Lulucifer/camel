
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.recording.addonresult.Payload
 */
@UriParams
@Configurer
public final class RecordingAddOnResultPayloadEndpointConfiguration extends TwilioConfiguration {
    @UriParam(description = "The account_sid")
    private String pathAccountSid;
    @UriParam(description = "The add_on_result_sid")
    private String pathAddOnResultSid;
    @UriParam(description = "The reference_sid")
    private String pathReferenceSid;
    @UriParam(description = "Delete by unique payload Sid")
    private String pathSid;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathAddOnResultSid() {
        return pathAddOnResultSid;
    }

    public void setPathAddOnResultSid(String pathAddOnResultSid) {
        this.pathAddOnResultSid = pathAddOnResultSid;
    }

    public String getPathReferenceSid() {
        return pathReferenceSid;
    }

    public void setPathReferenceSid(String pathReferenceSid) {
        this.pathReferenceSid = pathReferenceSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}
