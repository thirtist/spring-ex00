package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Component
@ToString
@Getter
//@AllArgsConstructor
@RequiredArgsConstructor
public class SampleHotel {
	
	@NonNull
	private Chef chef;
	
	/*
	 * public SampleHotel(Chef chef) { this.chef =chef; }
	 */
}
