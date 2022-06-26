import { registerPlugin } from '@capacitor/core';

import type { SunmiCardReaderPlugin } from './definitions';

const SunmiCardReader = registerPlugin<SunmiCardReaderPlugin>(
  'SunmiCardReader',
  {
    web: () => import('./web').then(m => new m.SunmiCardReaderWeb()),
  },
);

export * from './definitions';
export { SunmiCardReader };
