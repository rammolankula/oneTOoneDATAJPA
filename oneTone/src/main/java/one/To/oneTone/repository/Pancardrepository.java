package one.To.oneTone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import one.To.oneTone.domain.Pancard;
@Repository
public interface Pancardrepository extends JpaRepository<Pancard, Integer> {
	
	Pancard findByPanId(Integer panId);

}
