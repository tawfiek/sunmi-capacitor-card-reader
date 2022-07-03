import { WebPlugin, PluginImplementations} from '@capacitor/core';

import type { SunmiCardDeviceModel, SunmiCardReaderPlugin, SunmiCardResult } from './definitions';

export class SunmiCardReaderWeb
  extends WebPlugin
  implements SunmiCardReaderPlugin {

  async readCard (): Promise<SunmiCardResult> {
    throw new Error('No web implementation please run the application on an android device');
  }

  async getDeviceModel (): Promise<SunmiCardDeviceModel> {
    try {
      throw new Error('No web implementation please run the application on an android device');
    } catch (e) {
      throw e;
    }
  }
}
