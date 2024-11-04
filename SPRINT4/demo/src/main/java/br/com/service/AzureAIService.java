package br.com.service;

import org.springframework.stereotype.Service;
import com.azure.ai.textanalytics.TextAnalyticsClient;
import com.azure.ai.textanalytics.TextAnalyticsClientBuilder;
import com.azure.ai.textanalytics.models.DocumentSentiment;
import com.azure.core.credential.AzureKeyCredential;

import org.springframework.beans.factory.annotation.Value;

@Service
public class AzureAIService {
	 private final TextAnalyticsClient client;

	    public AzureAIService(@Value("${azure.cognitive.key}") String key, 
	                          @Value("${azure.cognitive.endpoint}") String endpoint) {
	        client = new TextAnalyticsClientBuilder()
	                .credential(new AzureKeyCredential(key))
	                .endpoint(endpoint)
	                .buildClient();
	    }

	    public String analisarSentimento(String texto) {
	        DocumentSentiment documentSentiment = client.analyzeSentiment(texto);
	        return documentSentiment.getSentiment().toString(); // Retorna o sentimento (POSITIVE, NEGATIVE, etc.)
	    }
	}

 	