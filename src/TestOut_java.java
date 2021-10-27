// -*- Java -*-
/*!
 * @file TestOut_java.java
 * @date $Date$
 *
 * $Id$
 */

import jp.go.aist.rtm.RTC.Manager;
import jp.go.aist.rtm.RTC.RTObject_impl;
import jp.go.aist.rtm.RTC.RtcDeleteFunc;
import jp.go.aist.rtm.RTC.RtcNewFunc;
import jp.go.aist.rtm.RTC.RegisterModuleFunc;
import jp.go.aist.rtm.RTC.util.Properties;

/**
 * TestOut_java
 * <p>
 * Test Out Component
 */
public class TestOut_java implements RtcNewFunc, RtcDeleteFunc, RegisterModuleFunc {

//  Module specification
//  <rtc-template block="module_spec">
    public static String component_conf[] = {
            "implementation_id", "TestOut_java",
            "type_name",         "TestOut_java",
            "description",       "Test Out Component",
            "version",           "1.2.2",
            "vendor",            "Sugar Sweet Robotics",
            "category",          "Test",
            "activity_type",     "STATIC",
            "max_instance",      "1",
            "language",          "Java",
            "lang_type",         "compile",
    	    ""
            };
//  </rtc-template>

    public RTObject_impl createRtc(Manager mgr) {
        return new TestOut_javaImpl(mgr);
    }

    public void deleteRtc(RTObject_impl rtcBase) {
        rtcBase = null;
    }
    public void registerModule() {
        Properties prop = new Properties(component_conf);
        final Manager manager = Manager.instance();
        manager.registerFactory(prop, new TestOut_java(), new TestOut_java());
    }
}
