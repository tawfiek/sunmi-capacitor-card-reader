import { WebPlugin } from '@capacitor/core';

import type { SunmiCardDeviceModel, SunmiCardReaderPlugin } from './definitions';

export class SunmiCardReaderWeb
  extends WebPlugin
  implements SunmiCardReaderPlugin {
  async initSunmiSDK (): Promise<void> {
    throw new Error('No web implementation please run the application on an android device [Sunmi Device]');
  }


  readCard (): void {
    throw new Error('No web implementation please run the application on an android device [Sunmi Device]');
  }

  async closeCardReader (): Promise<void> {
    throw new Error('No web implementation please run the application on an android device [Sunmi Device]');
  }

  async getDeviceModel (): Promise<SunmiCardDeviceModel> {
    try {
      throw new Error('No web implementation please run the application on an android device [Sunmi Device]');
    } catch (e) {
      throw e;
    }
  }
}
