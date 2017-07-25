package com.ignite;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.ignite.cache.query.annotations.QuerySqlField;

public class SurveyImage implements Serializable {

	private static final long serialVersionUID = 1L;

	@QuerySqlField
	private String gasCompany;
	@QuerySqlField
	private String surveyCompany;
	@QuerySqlField
	private String survey;
	@QuerySqlField
	private String session;
	@QuerySqlField
	private String camera;
	@QuerySqlField
	private String fileName;
	@QuerySqlField
	private String fileLocation;
	@QuerySqlField
	private float latitude;
	@QuerySqlField
	private float longitude;
	@QuerySqlField(index = true)
	private Long id;
	
	private static final AtomicLong ID_GEN = new AtomicLong();

	public SurveyImage(String gasCompany, String surveyCompany, String survey, String session, String camera,
			String fileName, String fileLocation) {
		this.gasCompany = gasCompany;
		this.surveyCompany = surveyCompany;
		this.survey = survey;
		this.session = session;
		this.camera = camera;
		this.fileName = fileName;
		this.fileLocation = fileLocation;
		id = ID_GEN.incrementAndGet();
	}

	public SurveyImage(String gasCompany, String surveyCompany, String survey, String session, String camera,
			String fileName, String fileLocation, float latitude, float longitude) {
		this.gasCompany = gasCompany;
		this.surveyCompany = surveyCompany;
		this.survey = survey;
		this.session = session;
		this.camera = camera;
		this.fileName = fileName;
		this.fileLocation = fileLocation;
		this.latitude = latitude;
		this.longitude = longitude;
		id = ID_GEN.incrementAndGet();

	}

	public String getGasCompany() {
		return gasCompany;
	}

	public String getSurveyCompany() {
		return surveyCompany;
	}

	public String getSurvey() {
		return survey;
	}

	public String getSession() {
		return session;
	}

	public String getCamera() {
		return camera;
	}

	public String getFileName() {
		return fileName;
	}
	
	public float getLatitude() { return latitude; }
 
	public void setLatitude(float latitude) { this.latitude = latitude; }
 
	public float getLongitude() { return longitude; }
 
	public void setLongitude(float longitude) { this.longitude = longitude; }

	public String getFileLocation() {
		return fileLocation;
	}
	
	public Long getId() {
		return this.id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		SurveyImage that = (SurveyImage) o;

		if (Float.compare(that.latitude, latitude) != 0)
			return false;
		if (Float.compare(that.longitude, longitude) != 0)
			return false;
		if (gasCompany != null ? !gasCompany.equals(that.gasCompany) : that.gasCompany != null)
			return false;
		if (surveyCompany != null ? !surveyCompany.equals(that.surveyCompany) : that.surveyCompany != null)
			return false;
		if (survey != null ? !survey.equals(that.survey) : that.survey != null)
			return false;
		if (session != null ? !session.equals(that.session) : that.session != null)
			return false;
		if (camera != null ? !camera.equals(that.camera) : that.camera != null)
			return false;
		if (fileName != null ? !fileName.equals(that.fileName) : that.fileName != null)
			return false;
		return fileLocation != null ? fileLocation.equals(that.fileLocation) : that.fileLocation == null;
	}

	@Override
	public int hashCode() {
		int result = gasCompany != null ? gasCompany.hashCode() : 0;
		result = 31 * result + (surveyCompany != null ? surveyCompany.hashCode() : 0);
		result = 31 * result + (survey != null ? survey.hashCode() : 0);
		result = 31 * result + (session != null ? session.hashCode() : 0);
		result = 31 * result + (camera != null ? camera.hashCode() : 0);
		result = 31 * result + (fileName != null ? fileName.hashCode() : 0);
		result = 31 * result + (fileLocation != null ? fileLocation.hashCode() : 0);
		result = 31 * result + (latitude != +0.0f ?
		Float.floatToIntBits(latitude) : 0);
		result = 31 * result + (longitude != +0.0f ?
		Float.floatToIntBits(longitude) : 0);
		return result;
	}

	@Override
	public String toString() {
		return "SurveyImage{" + "gasCompany='" + gasCompany + '\'' + ", surveyCompany='" + surveyCompany + '\''
				+ ", survey='" + survey + '\'' + ", session='" + session + '\'' + ", camera='" + camera + '\''
				+ ", fileName='" + fileName + '\'' + ", fileLocation='" + fileLocation + '\'' +  ", latitude=" + latitude
				 + ", longitude=" + longitude + +'\'' + '}';
	}
}