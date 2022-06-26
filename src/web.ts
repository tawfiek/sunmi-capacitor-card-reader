import { WebPlugin } from '@capacitor/core';

import type { SunmiCardReaderPlugin } from './definitions';

export class SunmiCardReaderWeb
  extends WebPlugin
  implements SunmiCardReaderPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
