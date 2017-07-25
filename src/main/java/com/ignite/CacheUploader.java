package com.ignite;

import javax.annotation.PostConstruct;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.CacheConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CacheUploader {

   @Autowired
   private IgniteConfiguration igniteConfiguration;

   private IgniteCache<Long, SurveyImage> cache;

   @PostConstruct
   public void initCache() {
	      
        Ignite ignite = Ignition.start(igniteConfiguration.getIgniteConfigurationFilename());

        CacheConfiguration<Long, SurveyImage> cfg = new CacheConfiguration<Long, SurveyImage>("IMAGE_CACHE");
        cfg.setIndexedTypes(Long.class, SurveyImage.class);
        cache = ignite.getOrCreateCache(cfg);
    }

    public void uploadToCache() {
    	SurveyImage surveyImg = new SurveyImage("GasCo", "SurveyCo", "Survey", "Session", "Camera", "Image.png", "/home/user/userx/image.png", 9.99f, 53.00f);   
    	cache.put(surveyImg.getId(), surveyImg);
    } 
}
