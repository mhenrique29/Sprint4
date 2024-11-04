package br.com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.service.TextAnalysisService;


@RestController
@RequestMapping("/api/ai")
public class TextAnalysisController {
	  private final TextAnalysisService textAnalysisService;

	    @Autowired
	    public TextAnalysisController(TextAnalysisService textAnalysisService) {
	        this.textAnalysisService = textAnalysisService;
	    }

	    @PostMapping("/analyze-sentiment")
	    public String analyzeSentiment(@RequestBody String text) {
	        return textAnalysisService.analyzeSentiment(text);
	    }
}

