import { PluginCallback } from "@capacitor/core";

export interface SunmiCardReaderPlugin {
  /**
   * Start listing to read the card,
   * you have to initialize the SDK first before calling this functionality.
   * @returns Promise<SunmiCardResult>
   */
  readCard: (callback: PluginCallback) => void;
  /**
   * Get the device model details.
   * @returns Promise<SunmiCardResult>
   */
  getDeviceModel: () => Promise<SunmiCardDeviceModel>;
  /**
   * Initializes the SDK to start reading cards.
   * @returns Promise<void>
   */
  initSunmiSDK: () => Promise<void>;
  /**
   * Closes the card reader.
   * @returns Promise<void>
   */
  closeCardReader: () => Promise<void>;
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
