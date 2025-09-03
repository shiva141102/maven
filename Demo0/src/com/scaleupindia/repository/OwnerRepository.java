package com.scaleupindia.repository;

import java.util.List;

import com.scaleupindia.dto.OwnerDTO;

/**
 * @author Shiva
 *
 */
public interface OwnerRepository {
	List<OwnerDTO> findAllOwners();
}
