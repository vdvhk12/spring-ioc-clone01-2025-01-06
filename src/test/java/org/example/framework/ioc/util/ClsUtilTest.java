package org.example.framework.ioc.util;

import static org.assertj.core.api.Assertions.assertThat;

import org.example.framework.ioc.util.sample.TestCar;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class ClsUtilTest {

    @Test
    @DisplayName("ClsUtil.loadClass")
    public void t1() {
        Class<TestCar> cls = ClsUtil.loadClass("org.example.framework.ioc.util.sample.TestCar");

        assertThat(cls).isEqualTo(TestCar.class);
    }

}