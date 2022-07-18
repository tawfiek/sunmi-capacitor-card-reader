# sunmi-p2-card-reader

This a plugin to integrate with sunmi payment SDK and work with the NFC card reader, test on Sunmi P2 only

### Supported Devices:
* Sunmi P2 (Tested on this model only).
* Sunmi P1N.
* Sunmi P2Lite.
* Sunmi P2Pro.
* Sunmi P14G.

## Install

```bash
npm install @capacitor-community/sunmi-card-reader
npx cap sync
```

## API

<docgen-index>

* [Interfaces](#interfaces)
* [Type Aliases](#type-aliases)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### Interfaces


#### PluginResultData


#### PluginResultError

| Prop          | Type                |
| ------------- | ------------------- |
| **`message`** | <code>string</code> |


### Type Aliases


#### PluginCallback

<code>(data: <a href="#pluginresultdata">PluginResultData</a>, error?: <a href="#pluginresulterror">PluginResultError</a>): void</code>


#### SunmiCardDeviceModel

<code>{ model: string, isP2: boolean, isP1N: boolean, isP2Lite: boolean, isP2Pro: boolean, isP14G: boolean, }</code>

</docgen-api>
### Type Aliases


#### SunmiCardResult

<code>{ uuid: string; }</code>


#### SunmiCardDeviceModel

<code>{ model: string, isP2: boolean, isP1N: boolean, isP2Lite: boolean, isP2Pro: boolean, isP14G: boolean, }</code>

</docgen-api>
