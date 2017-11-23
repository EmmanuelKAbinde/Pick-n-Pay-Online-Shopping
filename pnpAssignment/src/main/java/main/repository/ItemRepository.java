
package main.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import main.model.items;

@Repository
public interface ItemRepository  extends CrudRepository <items, String>
{

}
