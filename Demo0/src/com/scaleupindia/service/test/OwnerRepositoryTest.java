package com.scaleupindia.service.test;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.scaleupindia.dto.OwnerDTO;
import com.scaleupindia.repository.OwnerRepository;
import com.scaleupindia.repository.impl.OwnerRepositoryImpl;

/**
 * @author Shiva
 *
 */
public class OwnerRepositoryTest {

	@Test
	public void testFindAllOwners() { 
		OwnerRepository ownerRepository = new OwnerRepositoryImpl();
		List<OwnerDTO> ownerDTOList = ownerRepository.findAllOwners();
		Assertions.assertFalse(ownerDTOList.isEmpty());
	}
}
