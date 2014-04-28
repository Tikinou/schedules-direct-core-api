package com.tikinou.schedulesdirect.core.domain.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tikinou.schedulesdirect.core.commands.status.GetStatusResult;
import com.tikinou.schedulesdirect.core.jackson.ModuleRegistration;
import org.junit.Test;

/**
 * @author Sebastien Astie.
 */
public class StatusSDTest {
    @Test
    public void testParsing() throws Exception {
        ObjectMapper mapper = ModuleRegistration.getInstance().getConfiguredObjectMapper();
        GetStatusResult result = mapper.readValue(StatusSDTest.class.getResourceAsStream("/v20131021/status/status.json"), GetStatusResult.class);
        assert result != null;
    }
}
