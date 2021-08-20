package com.moodcompany.moodwheather.domain;




import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity {
	
	   @Version
	    private Long version;
	
	    @CreationTimestamp
	    @Column(updatable = false)
	    private Timestamp createdDate;

	    @UpdateTimestamp
	    private Timestamp lastModifiedDate;

}
