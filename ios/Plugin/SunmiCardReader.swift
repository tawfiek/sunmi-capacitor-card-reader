import Foundation

@objc public class SunmiCardReader: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
