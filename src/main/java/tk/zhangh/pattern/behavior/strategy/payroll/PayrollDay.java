package tk.zhangh.pattern.behavior.strategy.payroll;

/**
 * 使用策略模式模拟薪资支付条件
 *
 * Created by ZhangHao on 16/11/7.
 */
public enum PayrollDay {
    MONDAY(PayType.WEEKDAY),
    TUDESDAY(PayType.WEEKDAY),
    WEDNESDAY(PayType.WEEKDAY),
    THURSDAY(PayType.WEEKDAY),
    FRIDAY(PayType.WEEKDAY),
    SATURDAY(PayType.WEEKEND),
    SUNDAY(PayType.WEEKEND);

    private final PayType payType;

    PayrollDay(PayType payType) {
        this.payType = payType;
    }

    double pay(double hoursWork, double payRate) {
        return payType.pay(hoursWork, payRate);
    }

    private enum PayType {

        WEEKDAY {
            @java.lang.Override
            double overtimePay(double hrs, double payRate) {
                return hrs <= HOURS_PRE_SHIFT ? 0 : (hrs - HOURS_PRE_SHIFT) * payRate / 2;
            }
        },

        WEEKEND {
            @java.lang.Override
            double overtimePay(double hrs, double payRate) {
                return hrs * payRate / 2;
            }
        };

        private static final int HOURS_PRE_SHIFT = 8;

        abstract double overtimePay(double hrs, double payRate);

        double pay(double hoursWorked, double payRate) {
            double basePay = hoursWorked * payRate;
            return basePay + overtimePay(hoursWorked, payRate);
        }
    }
}
