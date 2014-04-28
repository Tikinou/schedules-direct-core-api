package com.tikinou.schedulesdirect.core.domain.headend;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.tikinou.schedulesdirect.core.commands.headend.GetHeadendsResult;
import com.tikinou.schedulesdirect.core.domain.Headend;
import com.tikinou.schedulesdirect.core.jackson.ModuleRegistration;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sebastien Astie.
 */
public class HeadendSDTest {
    @Test
    public void testParsing() throws Exception {
        ObjectMapper mapper = ModuleRegistration.getInstance().getConfiguredObjectMapper();
        GetHeadendsResult headendsResult = mapper.readValue(HeadendSDTest.class.getResourceAsStream("/v20131021/headend/headends.json"), GetHeadendsResult.class);
        assert headendsResult != null;
    }
}
