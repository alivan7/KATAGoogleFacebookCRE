package edu.alenasoft.principlespatterns.patterns.observer;

import org.junit.jupiter.api.Test;

class DataCenterAppTest {

  @Test
  void execute() {
    var dataCenter = new DataCenterApp();

    dataCenter.execute();
  }
}
