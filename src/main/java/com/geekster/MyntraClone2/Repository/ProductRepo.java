package com.geekster.MyntraClone2.Repository;

import com.geekster.MyntraClone2.Models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Products,Integer>
{

}
