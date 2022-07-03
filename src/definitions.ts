export interface SunmiCardReaderPlugin {
  readCard: () => Promise<SunmiCardResult>;
  getDeviceModel: () => Promise<SunmiCardDeviceModel>;
  initSunmiSDK: () => Promise<void>;
}

export type SunmiCardResult = {
  uuid: string;
};

export type SunmiCardDeviceModel = {
  model: string,
  isP2: boolean,
  isP1N: boolean,
  isP2Lite: boolean,
  isP2Pro: boolean,
  isP14G: boolean,
}
