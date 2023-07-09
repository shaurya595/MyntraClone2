package com.geekster.MyntraClone2.Repository;

import com.geekster.MyntraClone2.Models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address,Integer> {
}
