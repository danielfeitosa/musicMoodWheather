package com.moodcompany.moodwheather.services;

import java.util.List;

import com.moodcompany.moodwheather.domain.Genre;
import com.moodcompany.moodwheather.domain.Track;

public interface RecommendTracksService {

	List<Track> recommendTracks(Genre genre);

}
