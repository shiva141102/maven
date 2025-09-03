package com.scaleupindia.service;

import java.util.List;

import com.scaleupindia.dto.OwnerDTO;

/**
 * @author Shiva
 *
 */
public interface OwnerService {
	List<OwnerDTO> findAllOwners();
}
