/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc2.qobuz.api.v02.API;

import com.mc2.qobuz.api.v02.API.elements.Album;

/**
 *
 * @author marco
 */
public interface QobuzApiController {
	
	Album getAlbum(String albumId) throws QobuzAPIException;
}
