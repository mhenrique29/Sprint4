package br.com.service;

import com.azure.ai.textanalytics.TextAnalyticsClient;
import com.azure.ai.textanalytics.models.DocumentSentiment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TextAnalysisService {
	 
	private final TextAnalyticsClient textAnalyticsClient;

	    @Autowired
	    public TextAnalysisService(TextAnalyticsClient textAnalyticsClient) {
	        this.textAnalyticsClient = textAnalyticsClient;
	    }

	    public String analyzeSentiment(String text) {
	        DocumentSentiment documentSentiment = textAnalyticsClient.analyzeSentiment(text);
	        return "Sentimento: " + documentSentiment.getSentiment() +
	               ", Positivo: " + documentSentiment.getConfidenceScores().getPositive() +
	               ", Neutro: " + documentSentiment.getConfidenceScores().getNeutral() +
	               ", Negativo: " + documentSentiment.getConfidenceScores().getNegative();
	    }}
