/**
 * 
 */
package org.qrbarcode.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
 
import org.qrbarcode.model.barcode.StoreInventoryDtl;

/**
 * @author harikrishna.trivedi
 *
 */ 
@Repository("storeInventoryDtlDao")
public class StoreInventoryDtlDaoImpl 
	extends GenericDAOImpl<StoreInventoryDtl, Integer> 
	implements StoreInventoryDtlDao {
 
    public StoreInventoryDtl findByBarCode(String barCode) {
    	Criteria criteria = createEntityCriteria(currentPrimarySession());
        criteria.add(Restrictions.eq("barCode", barCode));
        return (StoreInventoryDtl) criteria.uniqueResult();
    }
    
    public void saveStoreInventoryDtl(StoreInventoryDtl storeInventoryDtl) {
        persist(storeInventoryDtl,currentPrimarySession());
    }
 
    public void deleteStoreInventoryDtlByBarCode(String barCode) {
        Query query = currentPrimarySession().createSQLQuery("delete from STORE_INVENTORY_DTL where BARCODE = :barCode");
        query.setString("barCode", barCode);
        query.executeUpdate();
    }
 
    @SuppressWarnings("unchecked")
    public List<StoreInventoryDtl> findAllStoreInventoryDtls() {
        Criteria criteria = createEntityCriteria(currentPrimarySession());
        return (List<StoreInventoryDtl>) criteria.list();
    }
 
   public StoreInventoryDtl findStoreInventoryDtlByBarCode(String barCode) {
        Criteria criteria = createEntityCriteria(currentPrimarySession());
        criteria.add(Restrictions.eq("barCode", barCode));
        return (StoreInventoryDtl) criteria.uniqueResult();
    }
}
