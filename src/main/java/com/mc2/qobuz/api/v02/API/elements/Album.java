/*
 * JAVA client for QOBUZ.API (http://www.qobuz.com/fr-fr/page/labs).
 *
 * Copyright (C) 2017 Marco Curti (marcoc1712 at gmail dot com).
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package com.mc2.qobuz.api.v02.API.elements;

import com.mc2.qobuz.api.v02.API.QobuzAPIException;
import com.mc2.qobuz.api.v02.API.lists.TrackList;
import java.util.ArrayList;

/**
 *
 * @author marco
 */
public interface Album extends QobuzObject{

	String AREA = "area"; //no
	String ARTICLES = "articles"; //no
	String ARTICLE_IDS = "article_ids"; //no
	String ARTIST = "artist";
	String AWARDS = "awards";
	String CATCHLINE = "catchline"; //no
	String COLLECTION = "collection"; //no
	String COMPOSER = "composer";
	String CONTENT = "content"; //no
	String COPYRIGHT = "copyright";
	String CREATED_AT = "created_at"; //no
	String DESCRIPTION = "description"; //no
	String DISPLAYABLE = "displayable"; //no
	String DOWNLOADABLE = "downloadable"; //no
	String DURATION = "duration"; //no
	String GENRE = "genre";
	String GENRES_LIST = "genres_list"; //no
	String GOODIES = "goodies"; //no
	String HIRES = "hires"; //no
	String HIRES_STREAMABLE = "hires_streamable"; //no
	String ID = "id"; //no
	String IMAGE = "image"; //no
	String INSTRUMENT = "instrument";
	String LABEL = "label";
	String MAXIMUM_BIT_DEPTH = "maximum_bit_depth"; //no
	String MAXIMUM_CHANNEL_COUNT = "maximum_channel_count"; //no
	String MAXIMUM_SAMPLING_RATE = "maximum_sampling_rate"; //no
	String MAXIMUM_TECHNICAL_SPECIFICATIONS = "maximum_technical_specifications"; //no
	String MEDIA_COUNT = "media_count"; //no
	/* 9/9/19 */
	String PARENTAL_WARNING = "parental_warning"; //no
	String PERIOD = "period";
	String POPULARITY = "popularity"; //no
	String PREVIEWABLE = "previewable"; //no
	String PRODUCT_SALES_FACTORS_MONTHLY = "product_sales_factors_monthly"; //no
	String PRODUCT_SALES_FACTORS_WEEKLY = "product_sales_factors_weekly"; //no
	String PRODUCT_SALES_FACTORS_YEARLY = "product_sales_factors_yearly"; //no
	String PRODUCT_TYPE = "product_type"; //no
	String PRODUCT_URL = "product_url"; //no
	String PROGRAM = "program"; //no
	String PURCHASABLE = "purchasable"; //no
	String PURCHASABLE_AT = "purchasable_at"; //no
	String QOBUZ_ID = "qobuz_id"; //no
	String RECORDING_INFORMATION = "recording_information"; //no
	String RELATIVE_URL = "relative_url"; //no
	String RELEASED_AT = "released_at"; //no
	String RELEASE_DATE_DOWNLOAD = "release_date_download"; //no
	String RELEASE_DATE_ORIGINAL = "release_date_original"; //no
	String RELEASE_DATE_STREAM = "release_date_stream"; //no
	String SAMPLEABLE = "sampleable"; //no
	String SLUG = "slug"; //no
	String STORE_RELATED = "store_related"; //no
	String STREAMABLE = "streamable"; //no
	String STREAMABLE_AT = "streamable_at"; //no
	String SUBTITLE = "subtitle"; //no
	String TITLE = "title";
	String TRACKS = "tracks"; //no
	String TRACKSCOUNT = "tracks_count"; //no  TRACK_TOTAL
	String UPC = "upc";
	String URL = "url"; //no

	boolean isTracklistComplete();
	
	void completeTrackList() throws QobuzAPIException;

	/**
	 * @return the area
	 */
	Area getArea();

	/**
	 * @return the articles
	 */
	ArrayList<Article> getArticles();

	/**
	 * @return the artist
	 */
	Artist getArtist();

	/**
	 * @return the awards
	 */
	ArrayList<? extends Award> getAwards();

	/**
	 * @return the catchline
	 */
	String getCatchline();

	/**
	 * @return the collection
	 */
	Collection getCollection();

	/**
	 * @return the composer
	 */
	Artist getComposer();

	/**
	 * @return the copyright
	 */
	String getCopyright();

	/**
	 * @return the created_at
	 */
	Long getCreated_at();

	/**
	 * @return the description
	 */
	String getDescription();

	/**
	 * @return the displayable
	 */
	Boolean getDisplayable();

	/**
	 * @return the downloadable
	 */
	Boolean getDownloadable();

	/**
	 * @return the duration
	 */
	Long getDuration();

	/**
	 * @return the genre
	 */
	Genre getGenre();

	/**
	 * @return the genres_list
	 */
	ArrayList<String> getGenres_list();

	/**
	 * @return the goodies
	 */
	ArrayList<? extends Goody> getGoodies();

	/**
	 * @return the hires
	 */
	Boolean getHires();

	/**
	 * @return the hires streamable
	 */
	Boolean getHiresStreamable();

	/**
	 * @return the id
	 */
	String getId();

	/**
	 * @return the image
	 */
	Image getImage();

	/**
	 * @return the store_related
	public ArrayList<StoreRelated> getStore_related() {
	return store_related;
	}
	/*
	 *
	 * @return the instrument
	 */
	Instrument getInstrument();

	/**
	 * @return the label
	 */
	Label getLabel();

	/**
	 * @return the maximum_channel_count
	 */
	Long getMaximumChannelCount();

	/**
	 * @return the maximum_bit_depth
	 */
	Long getMaximum_bit_depth();

	/**
	 * @return the maximum_sampling_rate
	 */
	Double getMaximum_sampling_rate();

	/**
	 * @return the maximum_technical_specifications
	 */
	String getMaximum_technical_specifications();

	/**
	 * @return the media_count
	 */
	Long getMedia_count();

	/**
	 * @return the parental warning
	 */
	Boolean getParentalWarning();

	/**
	 * @return the period
	 */
	Period getPeriod();

	/**
	 * @return the popularity
	 */
	Double getPopularity();

	/**
	 * @return the previewable
	 */
	Boolean getPreviewable();

	/**
	 * @return the product_sales_factors_monthly
	 */
	Double getProduct_sales_factors_monthly();

	/**
	 * @return the product_sales_factors_weekly
	 */
	Double getProduct_sales_factors_weekly();

	/**
	 * @return the product_sales_factors_yearly
	 */
	Double getProduct_sales_factors_yearly();

	/**
	 * @return the product_type
	 */
	String getProduct_type();

	/**
	 * @return the product_url
	 */
	String getProduct_url();

	/**
	 * @return the program
	 */
	String getProgram();

	/**
	 * @return the purchasable
	 */
	Boolean getPurchasable();

	/**
	 * @return the purchasable_at
	 */
	Long getPurchasable_at();

	/**
	 * @return the qobuz_id
	 */
	Long getQobuz_id();

	/**
	 * @return the recording_information
	 */
	String getRecording_information();

	/**
	 * @return the relative_url
	 */
	String getRelative_url();

	/**
	 * @return the release_date_download
	 */
	String getReleaseDateDownload();

	/**
	 * @return the release_date_original
	 */
	String getReleaseDateOriginal();
	/**
	 * @return the article_Ids (not used)
	public List<String> getArticleIds() {
	return article_ids;
	}
	 * @return the store_related (not used)
	public ArrayList<StoreRelated> getStore_related() {
	return store_related;
	}
	 */

	/**
	 * @return the release_date_stream
	 */
	String getReleaseDateStream();

	/**
	 * @return the released_at
	 */
	Long getReleased_at();

	/**
	 * @return the sampleable
	 */
	Boolean getSampleable();

	/**
	 * @return the slug
	 */
	String getSlug();

	/**
	 * @return the streamable
	 */
	Boolean getStreamable();

	/**
	 * @return the streamable_at
	 */
	Long getStreamable_at();

	/**
	 * @return the subtitle
	 */
	String getSubtitle();

	/**
	 * @return the title
	 */
	String getTitle();

	/**
	 * @return the tracks
	 */
	TrackList getTracks();

	/**
	 * @return the tracks_count
	 */
	Long getTracks_count();

	/**
	 * @return the upc
	 */
	String getUpc();

	/**
	 * @return the url
	 */
	String getUrl();

	
	
}
