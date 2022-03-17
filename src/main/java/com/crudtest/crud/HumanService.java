package com.crudtest.crud;

import java.util.List;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HumanService {
  private final HumanRepository humanRepository;

  public List<Human> getAllHumans() {
    return humanRepository.findAll();
  }

  public Human getHumanById(Long humanId) {
    return humanRepository.findById(humanId).orElseThrow();
  }

  @Transactional
  public Human createHuman(Human human) {
    return humanRepository.save(human);
  }
}
