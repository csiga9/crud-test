package com.crudtest.crud;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/human")
@RequiredArgsConstructor
public class HumanController {
private  final HumanService humanService;

  @GetMapping(value = "")
  public List<Human> getAllHumans() {
    return humanService.getAllHumans();
  }

  @GetMapping(value="/{humanId}")
  public Human getById(@PathVariable Long humanId) {
    return humanService.getHumanById(humanId);
  }

  @PostMapping(value = "")
  public Human createHuman(@RequestBody Human human) {
    return humanService.createHuman(human);
  }
}
