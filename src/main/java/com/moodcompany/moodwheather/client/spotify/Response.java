package com.moodcompany.moodwheather.client.spotify;

import java.util.List;

import com.moodcompany.moodwheather.domain.Track;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {
	
	List<Track> tracks;

}
