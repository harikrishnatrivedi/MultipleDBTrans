/**
 * 
 */
package org.qrbarcode.dao;

import java.util.List;

import org.qrbarcode.model.barcode.StoreInventoryDtl;

/**
 * @author harikrishna.trivedi
 *
 */
public interface StoreInventoryDtlDao 
	extends GenericDAO<StoreInventoryDtl, Integer> {
 
	StoreInventoryDtl findByBarCode(String barCode);
 
    void saveStoreInventoryDtl(StoreInventoryDtl storeInventoryDtl);
     
    void deleteStoreInventoryDtlByBarCode(String barCode);
     
    List<StoreInventoryDtl> findAllStoreInventoryDtls();
 
    StoreInventoryDtl findStoreInventoryDtlByBarCode(String barCode);
 
}