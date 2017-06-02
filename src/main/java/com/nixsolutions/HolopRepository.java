package com.nixsolutions;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface HolopRepository extends CrudRepository<Holop, Long>
{
}
