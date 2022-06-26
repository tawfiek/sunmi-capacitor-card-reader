export interface SunmiCardReaderPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
