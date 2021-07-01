package geography.Repository;

import geography.Entity.RegionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<RegionEntity, Long> {

    List<RegionEntity> findByName(String region);
}