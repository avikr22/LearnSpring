package com.exercise;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.exercise.domain.Category;

public class CategoryTest {
	Category category;
	
	@Before
	public void setUp() throws Exception{
		category = new Category();
	}
	@Test
	public void testGetId() throws Exception{ 
		Long idValue = 4l;
		category.setId(idValue);
		assertEquals(Long.valueOf(4l), category.getId());
	}

	@Test
	public void testGetDescription() throws Exception{
		//fail("Not yet implemented");
	}

	@Test
	public void testGetRecipes() {
		//fail("Not yet implemented");
	}

}
