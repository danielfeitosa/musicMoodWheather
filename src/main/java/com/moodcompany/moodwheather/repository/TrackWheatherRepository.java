package com.moodcompany.moodwheather.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moodcompany.moodwheather.domain.TrackWheather;

public interface TrackWheatherRepository  extends JpaRepository<TrackWheather,Long> {

}
