package my.app.momschoice.SendNotification;

//import android.app.NotificationChannel;
//import android.app.NotificationManager;
//import android.app.PendingIntent;
//import android.content.Context;
//import android.content.Intent;
//import android.media.RingtoneManager;
//import android.os.Build;
//
//import androidx.core.app.NotificationCompat;
//import androidx.core.app.NotificationManagerCompat;
//import androidx.core.content.ContextCompat;
//
//import my.app.momschoice.chefFoodPanel.ChefPreparedOrderView;
//import my.app.momschoice.ChefFoodPanel_BottomNavigation;
////import my.app.momschoice.customerFoodPanel.PayableOrders;
//import my.app.momschoice.CustomerFoodPanel_BottomNavigation;
////import my.app.momschoice.Delivery_FoodPanelBottomNavigation;
//import my.app.momschoice.MainActivity;
//import my.app.momschoice.R;
//import java.util.Random;
//
//public class ShowNotification {
//
//
//
//    public static void ShowNotif(Context context, String title, String message, String page) {
//        String CHANNEL_ID = "NOTICE";
//        String CHANNEL_NAME = "NOTICE";
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT);
//            channel.enableLights(true);
//            channel.enableVibration(true);
//            channel.setLockscreenVisibility(NotificationCompat.VISIBILITY_PUBLIC);
//            NotificationManager manager = context.getSystemService(NotificationManager.class);
//            manager.createNotificationChannel(channel);
//        }
//        Intent acIntent = new Intent(context, MainActivity.class);
//        acIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, acIntent, PendingIntent.FLAG_ONE_SHOT);
//        if (page.trim().equalsIgnoreCase("Order")) {
//            acIntent = new Intent(context, ChefFoodPanel_BottomNavigation.class).putExtra("PAGE", "Orderpage");
//            pendingIntent = PendingIntent.getActivity(context, 0, acIntent, PendingIntent.FLAG_ONE_SHOT);
//        }
////        if (page.trim().equalsIgnoreCase("Payment")) {
////            acIntent = new Intent(context, PayableOrders.class);
////            pendingIntent = PendingIntent.getActivity(context, 0, acIntent, PendingIntent.FLAG_ONE_SHOT);
////        }
//        if (page.trim().equalsIgnoreCase("Home")) {
//            acIntent = new Intent(context, CustomerFoodPanel_BottomNavigation.class).putExtra("PAGE", "Homepage");
//            pendingIntent = PendingIntent.getActivity(context, 0, acIntent, PendingIntent.FLAG_ONE_SHOT);
//        }
//        if (page.trim().equalsIgnoreCase("Confirm")) {
//            acIntent = new Intent(context, ChefFoodPanel_BottomNavigation.class).putExtra("PAGE", "Confirmpage");
//            pendingIntent = PendingIntent.getActivity(context, 0, acIntent, PendingIntent.FLAG_ONE_SHOT);
//        }
//        if (page.trim().equalsIgnoreCase("Preparing")) {
//            acIntent = new Intent(context, CustomerFoodPanel_BottomNavigation.class).putExtra("PAGE", "Preparingpage");
//            pendingIntent = PendingIntent.getActivity(context, 0, acIntent, PendingIntent.FLAG_ONE_SHOT);
//        }
//        if (page.trim().equalsIgnoreCase("Prepared")) {
//            acIntent = new Intent(context, CustomerFoodPanel_BottomNavigation.class).putExtra("PAGE", "Preparedpage");
//            pendingIntent = PendingIntent.getActivity(context, 0, acIntent, PendingIntent.FLAG_ONE_SHOT);
//        }
////        if (page.trim().equalsIgnoreCase("DeliveryOrder")) {
////            acIntent = new Intent(context, Delivery_FoodPanelBottomNavigation.class).putExtra("PAGE", "DeliveryOrderpage");
////            pendingIntent = PendingIntent.getActivity(context, 0, acIntent, PendingIntent.FLAG_ONE_SHOT);
////        }
//        if (page.trim().equalsIgnoreCase("DeliverOrder")) {
//            acIntent = new Intent(context, CustomerFoodPanel_BottomNavigation.class).putExtra("PAGE", "DeliverOrderpage");
//            pendingIntent = PendingIntent.getActivity(context, 0, acIntent, PendingIntent.FLAG_ONE_SHOT);
//        }
//        if (page.trim().equalsIgnoreCase("AcceptOrder")) {
//            acIntent = new Intent(context, ChefFoodPanel_BottomNavigation.class).putExtra("PAGE", "AcceptOrderpage");
//            pendingIntent = PendingIntent.getActivity(context, 0, acIntent, PendingIntent.FLAG_ONE_SHOT);
//        }
//        if (page.trim().equalsIgnoreCase("RejectOrder")) {
//            acIntent = new Intent(context, ChefPreparedOrderView.class).putExtra("PAGE", "RejectOrderpage");
//            pendingIntent = PendingIntent.getActivity(context, 0, acIntent, PendingIntent.FLAG_ONE_SHOT);
//        }
//        if (page.trim().equalsIgnoreCase("ThankYou")) {
//            acIntent = new Intent(context, CustomerFoodPanel_BottomNavigation.class).putExtra("PAGE", "ThankYoupage");
//            pendingIntent = PendingIntent.getActivity(context, 0, acIntent, PendingIntent.FLAG_ONE_SHOT);
//        }
//        if (page.trim().equalsIgnoreCase("Delivered")) {
//            acIntent = new Intent(context, ChefFoodPanel_BottomNavigation.class).putExtra("PAGE", "Deliveredpage");
//            pendingIntent = PendingIntent.getActivity(context, 0, acIntent, PendingIntent.FLAG_ONE_SHOT);
//        }
//
//
//        NotificationCompat.Builder nBuilder = new NotificationCompat.Builder(context, CHANNEL_ID).setSmallIcon(R.drawable.ic_chef_hat_and_fork)
//                .setColor(ContextCompat.getColor(context,R.color.Red))
//                .setContentTitle(title)
//                .setContentText(message)
//                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
//                .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
//                .setAutoCancel(true)
//                .setStyle(new NotificationCompat.BigTextStyle().bigText(message))
//                .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
//                .setContentIntent(pendingIntent);
//        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(context);
//        int random = new Random().nextInt(9999 - 1) + 1;
//        notificationManagerCompat.notify(random, nBuilder.build());
//    }
//}


import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.Build;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;

//import my.app.momschoice.chefFoodPanel.ChefPreparedOrderView;
//import my.app.momschoice.ChefFoodPanel_BottomNavigation;
//import my.app.momschoice.CustomerFoodPanel_BottomNavigation;
//import my.app.momschoice.MainActivity;
//import my.app.momschoice.R;
//
//import java.util.Random;
//
//public class ShowNotification {
//
//    private static final int NOTIFICATION_REQUEST_CODE = 0;
//
//    public static void ShowNotif(Context context, String title, String message, String page) {
//        String CHANNEL_ID = "NOTICE";
//        String CHANNEL_NAME = "NOTICE";
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT);
//            channel.enableLights(true);
//            channel.enableVibration(true);
//            channel.setLockscreenVisibility(NotificationCompat.VISIBILITY_PUBLIC);
//            NotificationManager manager = context.getSystemService(NotificationManager.class);
//            manager.createNotificationChannel(channel);
//        }
//
//        Intent acIntent = new Intent(context, MainActivity.class);
//        acIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//
//        // Utilisation du PendingIntent avec les drapeaux de mutabilité
//        PendingIntent pendingIntent = PendingIntent.getActivity(
//                context,
//                NOTIFICATION_REQUEST_CODE,
//                acIntent,
//                PendingIntent.FLAG_IMMUTABLE | PendingIntent.FLAG_UPDATE_CURRENT
//        );
//
//        if (page.trim().equalsIgnoreCase("Order")) {
//            acIntent = new Intent(context, ChefFoodPanel_BottomNavigation.class).putExtra("PAGE", "Orderpage");
//        } else if (page.trim().equalsIgnoreCase("Home")) {
//            acIntent = new Intent(context, CustomerFoodPanel_BottomNavigation.class).putExtra("PAGE", "Homepage");
//        } else if (page.trim().equalsIgnoreCase("Confirm")) {
//            acIntent = new Intent(context, ChefFoodPanel_BottomNavigation.class).putExtra("PAGE", "Confirmpage");
//        } else if (page.trim().equalsIgnoreCase("Preparing")) {
//            acIntent = new Intent(context, CustomerFoodPanel_BottomNavigation.class).putExtra("PAGE", "Preparingpage");
//        } else if (page.trim().equalsIgnoreCase("Prepared")) {
//            acIntent = new Intent(context, CustomerFoodPanel_BottomNavigation.class).putExtra("PAGE", "Preparedpage");
//        } else if (page.trim().equalsIgnoreCase("DeliverOrder")) {
//            acIntent = new Intent(context, CustomerFoodPanel_BottomNavigation.class).putExtra("PAGE", "DeliverOrderpage");
//        } else if (page.trim().equalsIgnoreCase("AcceptOrder")) {
//            acIntent = new Intent(context, ChefFoodPanel_BottomNavigation.class).putExtra("PAGE", "AcceptOrderpage");
//        } else if (page.trim().equalsIgnoreCase("RejectOrder")) {
//            acIntent = new Intent(context, ChefPreparedOrderView.class).putExtra("PAGE", "RejectOrderpage");
//        } else if (page.trim().equalsIgnoreCase("ThankYou")) {
//            acIntent = new Intent(context, CustomerFoodPanel_BottomNavigation.class).putExtra("PAGE", "ThankYoupage");
//        } else if (page.trim().equalsIgnoreCase("Delivered")) {
//            acIntent = new Intent(context, ChefFoodPanel_BottomNavigation.class).putExtra("PAGE", "Deliveredpage");
//        }
//
//        pendingIntent = PendingIntent.getActivity(context, 0, acIntent, PendingIntent.FLAG_ONE_SHOT | PendingIntent.FLAG_IMMUTABLE);
//
//        NotificationCompat.Builder nBuilder = new NotificationCompat.Builder(context, CHANNEL_ID)
//                .setSmallIcon(R.drawable.orderstobe)
//                .setColor(ContextCompat.getColor(context, R.color.Red))
//                .setContentTitle(title)
//                .setContentText(message)
//                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
//                .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
//                .setAutoCancel(true)
//                .setStyle(new NotificationCompat.BigTextStyle().bigText(message))
//                .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
//                .setContentIntent(pendingIntent);
//
//        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(context);
//        int random = new Random().nextInt(9999 - 1) + 1;
//        notificationManagerCompat.notify(random, nBuilder.build());
//    }
//}


import my.app.momschoice.chefFoodPanel.ChefPreparedOrderView;
import my.app.momschoice.ChefFoodPanel_BottomNavigation;
import my.app.momschoice.CustomerFoodPanel_BottomNavigation;
import my.app.momschoice.MainActivity;
import my.app.momschoice.R;

import java.util.Random;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.app.PendingIntent;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import android.media.RingtoneManager;

public class ShowNotification {

    private static final int NOTIFICATION_REQUEST_CODE = 0;
    private static final String CHANNEL_ID = "NOTICE";
    private static final String CHANNEL_NAME = "NOTICE";

    public static void ShowNotif(Context context, String title, String message, String page) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU &&
                ContextCompat.checkSelfPermission(context, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            // Permission is not granted, handle accordingly (e.g., show a message or request permission)
            // This part is just for example and should be adapted based on how you want to handle the missing permission
            return;
        }

        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                NotificationChannel channel = new NotificationChannel(CHANNEL_ID, CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT);
                channel.enableLights(true);
                channel.enableVibration(true);
                channel.setLockscreenVisibility(NotificationCompat.VISIBILITY_PUBLIC);
                NotificationManager manager = context.getSystemService(NotificationManager.class);
                manager.createNotificationChannel(channel);
            }

            Intent acIntent = getIntentForPage(context, page);
            PendingIntent pendingIntent = PendingIntent.getActivity(
                    context,
                    NOTIFICATION_REQUEST_CODE,
                    acIntent,
                    PendingIntent.FLAG_IMMUTABLE | PendingIntent.FLAG_UPDATE_CURRENT
            );

            NotificationCompat.Builder nBuilder = new NotificationCompat.Builder(context, CHANNEL_ID)
                    .setSmallIcon(R.drawable.orderstobe)
                    .setColor(ContextCompat.getColor(context, R.color.Red))
                    .setContentTitle(title)
                    .setContentText(message)
                    .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                    .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
                    .setAutoCancel(true)
                    .setStyle(new NotificationCompat.BigTextStyle().bigText(message))
                    .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
                    .setContentIntent(pendingIntent);

            NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(context);
            int random = new Random().nextInt(9999 - 1) + 1;
            notificationManagerCompat.notify(random, nBuilder.build());

        } catch (SecurityException e) {
            // Handle the exception, e.g., log it or show a message to the user
            e.printStackTrace();
        }
    }

    private static Intent getIntentForPage(Context context, String page) {
        Intent intent = new Intent(context, MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        switch (page.trim().toLowerCase()) {
            case "order":
                intent = new Intent(context, ChefFoodPanel_BottomNavigation.class).putExtra("PAGE", "Orderpage");
                break;
            case "home":
                intent = new Intent(context, CustomerFoodPanel_BottomNavigation.class).putExtra("PAGE", "Homepage");
                break;
            case "confirm":
                intent = new Intent(context, ChefFoodPanel_BottomNavigation.class).putExtra("PAGE", "Confirmpage");
                break;
            case "preparing":
                intent = new Intent(context, CustomerFoodPanel_BottomNavigation.class).putExtra("PAGE", "Preparingpage");
                break;
            case "prepared":
                intent = new Intent(context, CustomerFoodPanel_BottomNavigation.class).putExtra("PAGE", "Preparedpage");
                break;
            case "deliverorder":
                intent = new Intent(context, CustomerFoodPanel_BottomNavigation.class).putExtra("PAGE", "DeliverOrderpage");
                break;
            case "acceptorder":
                intent = new Intent(context, ChefFoodPanel_BottomNavigation.class).putExtra("PAGE", "AcceptOrderpage");
                break;
            case "rejectorder":
                intent = new Intent(context, ChefPreparedOrderView.class).putExtra("PAGE", "RejectOrderpage");
                break;
            case "thankyou":
                intent = new Intent(context, CustomerFoodPanel_BottomNavigation.class).putExtra("PAGE", "ThankYoupage");
                break;
            case "delivered":
                intent = new Intent(context, ChefFoodPanel_BottomNavigation.class).putExtra("PAGE", "Deliveredpage");
                break;
            default:
                // Default intent (MainActivity) is already set
                break;
        }
        return intent;
    }
}
