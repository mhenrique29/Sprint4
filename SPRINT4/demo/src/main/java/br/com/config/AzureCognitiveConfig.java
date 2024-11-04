package br.com.config;

import com.azure.ai.textanalytics.TextAnalyticsClient;
import com.azure.ai.textanalytics.TextAnalyticsClientBuilder;
import com.azure.core.credential.AzureKeyCredential;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AzureCognitiveConfig {
	
	@Value("${azure.cognitive.endpoint}")
	    private String endpoint;

	    @Value("${azure.cognitive.key}")
	    private String key;

	    @Bean
	    public TextAnalyticsClient textAnalyticsClient() {
	        return new TextAnalyticsClientBuilder()
	                .endpoint(endpoint)
	                .credential(new AzureKeyCredential(key))
	                .buildClient();
	    }
}
