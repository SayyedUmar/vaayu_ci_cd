pipeline {
  agent any
  stages {
    stage('Select Component') {
      steps {
        script {
          try{
            sh 'aws ecs list-tasks --cluster ecs_cluster_uat10 --desired-status RUNNING --output text | awk \'{print $2}\''
            library 'image'
            component = input( id: 'userInput', message: 'Select your choice', parameters: [ [$class: 'ChoiceParameterDefinition', choices: ['Web','Clustering Core','Location Service', 'Android App', 'IOS App'].join('\n'), description: '', name: ''] ])
            image_version = input( id: 'userInput', message: 'Select your choice', parameters: [ [$class: 'ChoiceParameterDefinition', choices: image(component), description: '', name: ''] ])
            echo component
            
            
          }catch(err){
            sh 'curl --user "shunyeka:hymjug-wimta4-ceFboh" -i -H "Content-Type: application/json" -X POST --data \'{"title":"Component selection Abort", "body":"Component selection aborted"}\' https://api.github.com/repos/MOOVE-Network/deploy-pipeline/issues'
          }
        }

      }
    }
    stage('Deploy to Test') {
      agent any
      environment {
        RAILS_ENV = 'production'
        REDIS_URL = 'redis://cache-uat10.2i6os5.0001.aps1.cache.amazonaws.com:6379'
        JOB_WORKER_URL = 'redis://cache-uat10.2i6os5.0001.aps1.cache.amazonaws.com:6379'
        DATABASE_NAME = 'moove_db'
        DATABASE_HOST = 'moove-uat10.cjny84emnsh9.ap-south-1.rds.amazonaws.com'
        DATABASE_PORT = '3306'
        DATABASE_USERNAME = 'MOOVE_DEV'
        PROJECT_URL = 'https://github.com/MOOVE-Network/moove-webapp.git'
        PROJECT_GIT_URL = 'git@github.com:MOOVE-Network/moove-webapp.git'
        PROJECT_GIT_TARGET = 'alpha_list_oct'
        RAILS_MAX_THREADS = '10'
        FCM_TOPIC_PREFIX = 'uat10'
        ANONYMOUS_APPLICATION_SID = 'APc068e4e88b11ef16b3fe94b9ca9fb779'
        EXOTEL_SID = '08039591060'
        EXOTEL_TOKEN = '31fbdf8f0a6734bd4bd1cdf1fd5e2f7f70ff3229'
        EXOTEL_CALLER_ID = '08039591060'
        OPERATOR_NUMBER = '8792656946'
        S3_ACCESS_KEY_ID = 'AKIAXAWJNTEUSEDN4A57'
        S3_SECRET_KEY = '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'
        S3_BUCKET = 'moove-assets-uat10'
        S3_REGION = 'ap-south-1'
        SERVER_URL = 'uat10.moove.network'
        ROLLBAR_ACCESS_TOKEN = '0025d0c26f5d4e41850ed00693cc79b8'
        BASIC_AUTH_USER = 'harman'
        BASIC_AUTH_PASSWORD = 'harman'
        SOLUTIONS_INFINI_API_KEY = 'A4fbafbca93401e6c43f7c067b58a507e'
        SOLUTIONS_INFINI_SENDER = 'iMOOVE'
        ENALBE_GUARD_PROVISIONGING = 'true'
        GEOHASH_AUTO_CLUSTERING = 'false'
        AUTO_CLUSTER = 'false'
        DATABASE_PASSWORD = 'NG$Pir7ySMJ9m&p9'
        ENABLE_LINE_MANAGER_APPROVE = 'true'
        ENABLE_TRANSPORT_DESK_MANAGER_APPROVE = 'true'
        NO_SHOW_APPROVAL_REQUIRED = 'false'
        CALCULATE_ETA = 'true'
        SEND_ANALYTICS_REPORT = 'true'
        ECS_CLUSTERNAME = 'ecs_cluster_uat10'
        ECS_SERVICENAME = ' ecs-service-uat10'
        ECR_REPO = '482532497705.dkr.ecr.ap-south-1.amazonaws.com/webapp'
        DB_INSTANCE_IDENTIFIER = 'mll'
        client = 'test'
        CLIENT_BUILD_NUMBER = '42'
        EMPLOYEE_ANDROID_APP_LINK = 'https://goo.gl/DZ131Z'
        EMPLOYEE_IOS_APP_LINK = 'https://goo.gl/etK6Zo'
        FCM_API_KEY = 'AAAAEXz4c6s:APA91bGE8CJdgnJQPsxgVAxM7asjVEdShM6wpq6jme5sShi4S095MdCuKOGSYuaE3AlrVYKeNrjcrfJQtIoafXabnOKI5kZOBarGkPKlo-pZah3f_iT6rvLA49CpJvx7UOf6JSzL0Zb4'
        GMAIL_USENAME = 'friend@moove.network'
        GOOGLE_MAPS_API_KEY = 'AIzaSyBL-ocE6P0pPmR6Ef4DC2BKqlnlMe1pQFk'
        PLIVO_AUTH_ID = 'MANMU4YWVJMZLIZDYWY'
        PLIVO_AUTH_TOKEN = 'YWU5YjQ5YjY2N2IxNzY2NzAyZDY2ZGY1MjkwMjc'
        S3_HOST_NAME = 's3.ap-south-1.amazonaws.com'
        AUTO_APPROVE_TRIP_CHANGE_REQUEST = 'true'
        AUTO_APPROVE_TRIP_CANCEL_REQUEST = 'false'
        CHANGE_TIME_CHECK_IN = '8.hours'
        CHANGE_TIME_CHECK_OUT = '4.hours'
        CANCEL_TIME_CHECK_IN = '4.hours'
        CANCEL_TIME_CHECK_OUT = '30.minutes'
        ONBOARD_PASSENGER_TIME = '3.minutes'
        CLUSTER_ALGORITHM = 'clustering_service'
        CLUSTERING_SERVICE_URL = 'cluster.uat10.moove.network'
        ECR_CONTAINER = 'web'
        DRIVER_APP_LINK = 'https://goo.gl/BWyW9c'
        EMPLOYEE_APP_LINK = 'https://goo.gl/6x2Tmg'
        SITE_NAME = 'uat10'
        NEW_RELIC_license_key = 'e1433c8ba8fd758baf4d92a82a6fb9229d95e7ac'
        NEW_RELIC_app_name = 'uat10.moove.network'
        NEW_RELIC_log_level = 'info'
        NEW_RELIC_monitor_mode = 'true'
        GMAIL_PASSWORD = 'm00ve4wd'
        TWILIO_ACCOUNT_SID = 'ACf47d0b64c1d8637b1dc7f4f91d33fba0'
        TWILIO_AUTH_TOKEN = 'f9bf5de0a0553275a6aa377a8b56f7ce'
        SECRET_KEY_BASE = 'daef0f128e8c899673cbcc71b3d4854112006de625db4bab0116818c7a7dc5cae52fc531dfb5f153d1b7fb3021331de744683b0346317751115c1837cbc69672'
        LOCATION_DATABASE_URL = 'MOOVE_DEV:NG$Pir7ySMJ9m&p9@tcp(moove-uat10.cjny84emnsh9.ap-south-1.rds.amazonaws.com:3306)/moove_db?parseTime=true'
        CLUSTERING_DATABASE_URL = 'MOOVE_DEV:NG$Pir7ySMJ9m&p9@tcp(moove-uat10.cjny84emnsh9.ap-south-1.rds.amazonaws.com:3306)/moove_db?parseTime=true'
      }
      steps {
        sh '''#!/bin/bash
          source ~/.bash_profile
          eval $(aws ecr get-login --no-include-email | sed \'s|https://||\')
          date +"%T"
         
          #sh 'aws ecs stop-task --cluster ${ECS_CLUSTERNAME} --task $task_def'          
          echo "stopping running ecs tasks"
          stopped_task = $(aws ecs list-tasks --cluster ${ECS_CLUSTERNAME} --desired-status RUNNING --output text | awk '{print $2}')
          aws ecs stop-task --task $stopped_task
          
          echo "Deploying Image to ${ECS_CLUSTERNAME} and ${ECS_SERVICENAME} "
          #docker run ${ECR_REPO}:client-${client}-build-${CLIENT_BUILD_NUMBER}  rake db:migrate &&
          ecs deploy ${ECS_CLUSTERNAME} ${ECS_SERVICENAME} \\
          -i ${ECR_CONTAINER} ${ECR_REPO}\':build-\'${CLIENT_BUILD_NUMBER} \\
          -i sidekiq ${ECR_REPO}\':build-\'${CLIENT_BUILD_NUMBER} \\
          -i db-migrate ${ECR_REPO}\':build-\'${CLIENT_BUILD_NUMBER} \\
          -e ${ECR_CONTAINER} \'RAILS_ENV\' ${RAILS_ENV} \\
          -e ${ECR_CONTAINER} \'GMAIL_USENAME\' ${GMAIL_USENAME} \\
          -e ${ECR_CONTAINER} \'GMAIL_PASSWORD\' ${GMAIL_PASSWORD} \\
          -e ${ECR_CONTAINER} \'GOOGLE_MAPS_API_KEY\' ${GOOGLE_MAPS_API_KEY} \\
          -e ${ECR_CONTAINER} \'FCM_API_KEY\' ${FCM_API_KEY} \\
          -e ${ECR_CONTAINER} \'FCM_TOPIC_PREFIX\' ${FCM_TOPIC_PREFIX} \\
          -e ${ECR_CONTAINER} \'TWILIO_ACCOUNT_SID\' ${TWILIO_ACCOUNT_SID} \\
          -e ${ECR_CONTAINER} \'TWILIO_AUTH_TOKEN\' ${TWILIO_AUTH_TOKEN} \\
          -e ${ECR_CONTAINER} \'ANONYMOUS_APPLICATION_SID\' ${ANONYMOUS_APPLICATION_SID} \\
          -e ${ECR_CONTAINER} \'PLIVO_AUTH_ID\' ${PLIVO_AUTH_ID} \\
          -e ${ECR_CONTAINER} \'PLIVO_AUTH_TOKEN\' ${PLIVO_AUTH_TOKEN} \\
          -e ${ECR_CONTAINER} \'EXOTEL_SID\' ${EXOTEL_SID} \\
          -e ${ECR_CONTAINER} \'EXOTEL_TOKEN\' ${EXOTEL_TOKEN} \\
          -e ${ECR_CONTAINER} \'EXOTEL_CALLER_ID\' ${EXOTEL_CALLER_ID} \\
          -e ${ECR_CONTAINER} \'OPERATOR_NUMBER\' ${OPERATOR_NUMBER} \\
          -e ${ECR_CONTAINER} \'S3_ACCESS_KEY_ID\' ${S3_ACCESS_KEY_ID} \\
          -e ${ECR_CONTAINER} \'S3_SECRET_KEY\' ${S3_SECRET_KEY} \\
          -e ${ECR_CONTAINER} \'S3_BUCKET\' ${S3_BUCKET} \\
          -e ${ECR_CONTAINER} \'S3_REGION\' ${S3_REGION} \\
          -e ${ECR_CONTAINER} \'SERVER_URL\' ${SERVER_URL} \\
          -e ${ECR_CONTAINER} \'SECRET_KEY_BASE\' ${SECRET_KEY_BASE} \\
          -e ${ECR_CONTAINER} \'ROLLBAR_ACCESS_TOKEN\' ${ROLLBAR_ACCESS_TOKEN} \\
          -e ${ECR_CONTAINER} \'BASIC_AUTH_USER\' ${BASIC_AUTH_USER} \\
          -e ${ECR_CONTAINER} \'BASIC_AUTH_PASSWORD\' ${BASIC_AUTH_PASSWORD} \\
          -e ${ECR_CONTAINER} \'SOLUTIONS_INFINI_API_KEY\' ${SOLUTIONS_INFINI_API_KEY} \\
          -e ${ECR_CONTAINER} \'SOLUTIONS_INFINI_SENDER\' ${SOLUTIONS_INFINI_SENDER} \\
          -e ${ECR_CONTAINER} \'ENALBE_GUARD_PROVISIONGING\' ${ENALBE_GUARD_PROVISIONGING} \\
          -e ${ECR_CONTAINER} \'GEOHASH_AUTO_CLUSTERING\' ${GEOHASH_AUTO_CLUSTERING} \\
          -e ${ECR_CONTAINER} \'AUTO_CLUSTER\' ${AUTO_CLUSTER} \\
          -e ${ECR_CONTAINER} \'REDIS_URL\' ${REDIS_URL} \\
          -e ${ECR_CONTAINER} \'JOB_WORKER_URL\' ${JOB_WORKER_URL} \\
          -e ${ECR_CONTAINER} \'DATABASE_NAME\' ${DATABASE_NAME} \\
          -e ${ECR_CONTAINER} \'DATABASE_HOST\' ${DATABASE_HOST} \\
          -e ${ECR_CONTAINER} \'DATABASE_PORT\' ${DATABASE_PORT} \\
          -e ${ECR_CONTAINER} \'DATABASE_USERNAME\' ${DATABASE_USERNAME} \\
          -e ${ECR_CONTAINER} \'DATABASE_PASSWORD\' ${DATABASE_PASSWORD} \\
          -e ${ECR_CONTAINER} \'RAILS_MAX_THREADS\' ${RAILS_MAX_THREADS} \\
          -e ${ECR_CONTAINER} \'ENABLE_LINE_MANAGER_APPROVE\' ${ENABLE_LINE_MANAGER_APPROVE} \\
          -e ${ECR_CONTAINER} \'ENABLE_TRANSPORT_DESK_MANAGER_APPROVE\' ${ENABLE_TRANSPORT_DESK_MANAGER_APPROVE} \\
          -e ${ECR_CONTAINER} \'NO_SHOW_APPROVAL_REQUIRED\' ${NO_SHOW_APPROVAL_REQUIRED} \\
          -e ${ECR_CONTAINER} \'CALCULATE_ETA\' ${CALCULATE_ETA} \\
          -e ${ECR_CONTAINER} \'SEND_ANALYTICS_REPORT\' ${SEND_ANALYTICS_REPORT} \\
          -e ${ECR_CONTAINER} \'EMPLOYEE_ANDROID_APP_LINK\' ${EMPLOYEE_ANDROID_APP_LINK} \\
          -e ${ECR_CONTAINER} \'EMPLOYEE_IOS_APP_LINK\' ${EMPLOYEE_IOS_APP_LINK} \\
          -e ${ECR_CONTAINER} \'S3_BUCKET\' ${S3_BUCKET} \\
          -e ${ECR_CONTAINER} \'AUTO_APPROVE_TRIP_CHANGE_REQUEST\' ${AUTO_APPROVE_TRIP_CHANGE_REQUEST} \\
          -e ${ECR_CONTAINER} \'AUTO_APPROVE_TRIP_CANCEL_REQUEST\' ${AUTO_APPROVE_TRIP_CANCEL_REQUEST} \\
          -e ${ECR_CONTAINER} \'CHANGE_TIME_CHECK_IN\' ${CHANGE_TIME_CHECK_IN} \\
          -e ${ECR_CONTAINER} \'CHANGE_TIME_CHECK_OUT\' ${CHANGE_TIME_CHECK_OUT} \\
          -e ${ECR_CONTAINER} \'CANCEL_TIME_CHECK_IN\' ${CANCEL_TIME_CHECK_IN} \\
          -e ${ECR_CONTAINER} \'CANCEL_TIME_CHECK_OUT\' ${CANCEL_TIME_CHECK_OUT} \\
          -e ${ECR_CONTAINER} \'ONBOARD_PASSENGER_TIME\' ${ONBOARD_PASSENGER_TIME} \\
          -e ${ECR_CONTAINER} \'CLUSTERING_SERVICE_URL\' ${CLUSTERING_SERVICE_URL} \\
          -e ${ECR_CONTAINER} \'CLUSTER_ALGORITHM\' ${CLUSTER_ALGORITHM} \\
          -e ${ECR_CONTAINER} \'S3_HOST_NAME\' ${S3_HOST_NAME} \\
          -e ${ECR_CONTAINER} \'SITE_NAME\' ${SITE_NAME} \\
          -e ${ECR_CONTAINER} \'NEW_RELIC_license_key\' ${NEW_RELIC_license_key} \\
          -e ${ECR_CONTAINER} \'NEW_RELIC_app_name\' ${NEW_RELIC_app_name} \\
          -e ${ECR_CONTAINER} \'NEW_RELIC_log_level\' ${NEW_RELIC_log_level} \\
          -e ${ECR_CONTAINER} \'NEW_RELIC_monitor_mode\' ${NEW_RELIC_monitor_mode} \\
          -e ${ECR_CONTAINER} \'DRIVER_APP_LINK\' ${DRIVER_APP_LINK} \\
          -e sidekiq \'RAILS_ENV\' ${RAILS_ENV} \\
          -e sidekiq \'GMAIL_USENAME\' ${GMAIL_USENAME} \\
          -e sidekiq \'GMAIL_PASSWORD\' ${GMAIL_PASSWORD} \\
          -e sidekiq \'GOOGLE_MAPS_API_KEY\' ${GOOGLE_MAPS_API_KEY} \\
          -e sidekiq \'FCM_API_KEY\' ${FCM_API_KEY} \\
          -e sidekiq \'FCM_TOPIC_PREFIX\' ${FCM_TOPIC_PREFIX} \\
          -e sidekiq \'TWILIO_ACCOUNT_SID\' ${TWILIO_ACCOUNT_SID} \\
          -e sidekiq \'TWILIO_AUTH_TOKEN\' ${TWILIO_AUTH_TOKEN} \\
          -e sidekiq \'ANONYMOUS_APPLICATION_SID\' ${ANONYMOUS_APPLICATION_SID} \\
          -e sidekiq \'PLIVO_AUTH_ID\' ${PLIVO_AUTH_ID} \\
          -e sidekiq \'PLIVO_AUTH_TOKEN\' ${PLIVO_AUTH_TOKEN} \\
          -e sidekiq \'EXOTEL_SID\' ${EXOTEL_SID} \\
          -e sidekiq \'EXOTEL_TOKEN\' ${EXOTEL_TOKEN} \\
          -e sidekiq \'EXOTEL_CALLER_ID\' ${EXOTEL_CALLER_ID} \\
          -e sidekiq \'OPERATOR_NUMBER\' ${OPERATOR_NUMBER} \\
          -e sidekiq \'S3_ACCESS_KEY_ID\' ${S3_ACCESS_KEY_ID} \\
          -e sidekiq \'S3_SECRET_KEY\' ${S3_SECRET_KEY} \\
          -e sidekiq \'S3_BUCKET\' ${S3_BUCKET} \\
          -e sidekiq \'S3_REGION\' ${S3_REGION} \\
          -e sidekiq \'SERVER_URL\' ${SERVER_URL} \\
          -e sidekiq \'SECRET_KEY_BASE\' ${SECRET_KEY_BASE} \\
          -e sidekiq \'ROLLBAR_ACCESS_TOKEN\' ${ROLLBAR_ACCESS_TOKEN} \\
          -e sidekiq \'BASIC_AUTH_USER\' ${BASIC_AUTH_USER} \\
          -e sidekiq \'BASIC_AUTH_PASSWORD\' ${BASIC_AUTH_PASSWORD} \\
          -e sidekiq \'SOLUTIONS_INFINI_API_KEY\' ${SOLUTIONS_INFINI_API_KEY} \\
          -e sidekiq \'SOLUTIONS_INFINI_SENDER\' ${SOLUTIONS_INFINI_SENDER} \\
          -e sidekiq \'ENALBE_GUARD_PROVISIONGING\' ${ENALBE_GUARD_PROVISIONGING} \\
          -e sidekiq \'GEOHASH_AUTO_CLUSTERING\' ${GEOHASH_AUTO_CLUSTERING} \\
          -e sidekiq \'AUTO_CLUSTER\' ${AUTO_CLUSTER} \\
          -e sidekiq \'REDIS_URL\' ${REDIS_URL} \\
          -e sidekiq \'JOB_WORKER_URL\' ${JOB_WORKER_URL} \\
          -e sidekiq \'DATABASE_NAME\' ${DATABASE_NAME} \\
          -e sidekiq \'DATABASE_HOST\' ${DATABASE_HOST} \\
          -e sidekiq \'DATABASE_PORT\' ${DATABASE_PORT} \\
          -e sidekiq \'DATABASE_USERNAME\' ${DATABASE_USERNAME} \\
          -e sidekiq \'DATABASE_PASSWORD\' ${DATABASE_PASSWORD} \\
          -e sidekiq \'RAILS_MAX_THREADS\' ${RAILS_MAX_THREADS} \\
          -e sidekiq \'ENABLE_LINE_MANAGER_APPROVE\' ${ENABLE_LINE_MANAGER_APPROVE} \\
          -e sidekiq \'ENABLE_TRANSPORT_DESK_MANAGER_APPROVE\' ${ENABLE_TRANSPORT_DESK_MANAGER_APPROVE} \\
          -e sidekiq \'NO_SHOW_APPROVAL_REQUIRED\' ${NO_SHOW_APPROVAL_REQUIRED} \\
          -e sidekiq \'CALCULATE_ETA\' ${CALCULATE_ETA} \\
          -e sidekiq \'SEND_ANALYTICS_REPORT\' ${SEND_ANALYTICS_REPORT} \\
          -e sidekiq \'EMPLOYEE_ANDROID_APP_LINK\' ${EMPLOYEE_ANDROID_APP_LINK} \\
          -e sidekiq \'EMPLOYEE_IOS_APP_LINK\' ${EMPLOYEE_IOS_APP_LINK} \\
          -e sidekiq \'S3_BUCKET\' ${S3_BUCKET} \\
          -e sidekiq \'AUTO_APPROVE_TRIP_CHANGE_REQUEST\' ${AUTO_APPROVE_TRIP_CHANGE_REQUEST} \\
          -e sidekiq \'AUTO_APPROVE_TRIP_CANCEL_REQUEST\' ${AUTO_APPROVE_TRIP_CANCEL_REQUEST} \\
          -e sidekiq \'CHANGE_TIME_CHECK_IN\' ${CHANGE_TIME_CHECK_IN} \\
          -e sidekiq \'CHANGE_TIME_CHECK_OUT\' ${CHANGE_TIME_CHECK_OUT} \\
          -e sidekiq \'CANCEL_TIME_CHECK_IN\' ${CANCEL_TIME_CHECK_IN} \\
          -e sidekiq \'CANCEL_TIME_CHECK_OUT\' ${CANCEL_TIME_CHECK_OUT} \\
          -e sidekiq \'ONBOARD_PASSENGER_TIME\' ${ONBOARD_PASSENGER_TIME} \\
          -e sidekiq \'CLUSTERING_SERVICE_URL\' ${CLUSTERING_SERVICE_URL} \\
          -e sidekiq \'CLUSTER_ALGORITHM\' ${CLUSTER_ALGORITHM} \\
          -e sidekiq \'S3_HOST_NAME\' ${S3_HOST_NAME} \\
          -e sidekiq \'SITE_NAME\' ${SITE_NAME} \\
          -e sidekiq \'NEW_RELIC_license_key\' ${NEW_RELIC_license_key} \\
          -e sidekiq \'NEW_RELIC_app_name\' ${NEW_RELIC_app_name} \\
          -e sidekiq \'NEW_RELIC_log_level\' ${NEW_RELIC_log_level} \\
          -e sidekiq \'NEW_RELIC_monitor_mode\' ${NEW_RELIC_monitor_mode} \\
          -e sidekiq \'DRIVER_APP_LINK\' ${DRIVER_APP_LINK} \\
          -e db-migrate \'RAILS_ENV\' ${RAILS_ENV} \\
          -e db-migrate \'GMAIL_USENAME\' ${GMAIL_USENAME} \\
          -e db-migrate \'GMAIL_PASSWORD\' ${GMAIL_PASSWORD} \\
          -e db-migrate \'GOOGLE_MAPS_API_KEY\' ${GOOGLE_MAPS_API_KEY} \\
          -e db-migrate \'FCM_API_KEY\' ${FCM_API_KEY} \\
          -e db-migrate \'FCM_TOPIC_PREFIX\' ${FCM_TOPIC_PREFIX} \\
          -e db-migrate \'TWILIO_ACCOUNT_SID\' ${TWILIO_ACCOUNT_SID} \\
          -e db-migrate \'TWILIO_AUTH_TOKEN\' ${TWILIO_AUTH_TOKEN} \\
          -e db-migrate \'ANONYMOUS_APPLICATION_SID\' ${ANONYMOUS_APPLICATION_SID} \\
          -e db-migrate \'PLIVO_AUTH_ID\' ${PLIVO_AUTH_ID} \\
          -e db-migrate \'PLIVO_AUTH_TOKEN\' ${PLIVO_AUTH_TOKEN} \\
          -e db-migrate \'EXOTEL_SID\' ${EXOTEL_SID} \\
          -e db-migrate \'EXOTEL_TOKEN\' ${EXOTEL_TOKEN} \\
          -e db-migrate \'EXOTEL_CALLER_ID\' ${EXOTEL_CALLER_ID} \\
          -e db-migrate \'OPERATOR_NUMBER\' ${OPERATOR_NUMBER} \\
          -e db-migrate \'S3_ACCESS_KEY_ID\' ${S3_ACCESS_KEY_ID} \\
          -e db-migrate \'S3_SECRET_KEY\' ${S3_SECRET_KEY} \\
          -e db-migrate \'S3_BUCKET\' ${S3_BUCKET} \\
          -e db-migrate \'S3_REGION\' ${S3_REGION} \\
          -e db-migrate \'SERVER_URL\' ${SERVER_URL} \\
          -e db-migrate \'SECRET_KEY_BASE\' ${SECRET_KEY_BASE} \\
          -e db-migrate \'ROLLBAR_ACCESS_TOKEN\' ${ROLLBAR_ACCESS_TOKEN} \\
          -e db-migrate \'BASIC_AUTH_USER\' ${BASIC_AUTH_USER} \\
          -e db-migrate \'BASIC_AUTH_PASSWORD\' ${BASIC_AUTH_PASSWORD} \\
          -e db-migrate \'SOLUTIONS_INFINI_API_KEY\' ${SOLUTIONS_INFINI_API_KEY} \\
          -e db-migrate \'SOLUTIONS_INFINI_SENDER\' ${SOLUTIONS_INFINI_SENDER} \\
          -e db-migrate \'ENALBE_GUARD_PROVISIONGING\' ${ENALBE_GUARD_PROVISIONGING} \\
          -e db-migrate \'GEOHASH_AUTO_CLUSTERING\' ${GEOHASH_AUTO_CLUSTERING} \\
          -e db-migrate \'AUTO_CLUSTER\' ${AUTO_CLUSTER} \\
          -e db-migrate \'REDIS_URL\' ${REDIS_URL} \\
          -e db-migrate \'JOB_WORKER_URL\' ${JOB_WORKER_URL} \\
          -e db-migrate \'DATABASE_NAME\' ${DATABASE_NAME} \\
          -e db-migrate \'DATABASE_HOST\' ${DATABASE_HOST} \\
          -e db-migrate \'DATABASE_PORT\' ${DATABASE_PORT} \\
          -e db-migrate \'DATABASE_USERNAME\' ${DATABASE_USERNAME} \\
          -e db-migrate \'DATABASE_PASSWORD\' ${DATABASE_PASSWORD} \\
          -e db-migrate \'RAILS_MAX_THREADS\' ${RAILS_MAX_THREADS} \\
          -e db-migrate \'ENABLE_LINE_MANAGER_APPROVE\' ${ENABLE_LINE_MANAGER_APPROVE} \\
          -e db-migrate \'ENABLE_TRANSPORT_DESK_MANAGER_APPROVE\' ${ENABLE_TRANSPORT_DESK_MANAGER_APPROVE} \\
          -e db-migrate \'NO_SHOW_APPROVAL_REQUIRED\' ${NO_SHOW_APPROVAL_REQUIRED} \\
          -e db-migrate \'CALCULATE_ETA\' ${CALCULATE_ETA} \\
          -e db-migrate \'SEND_ANALYTICS_REPORT\' ${SEND_ANALYTICS_REPORT} \\
          -e db-migrate \'EMPLOYEE_ANDROID_APP_LINK\' ${EMPLOYEE_ANDROID_APP_LINK} \\
          -e db-migrate \'EMPLOYEE_IOS_APP_LINK\' ${EMPLOYEE_IOS_APP_LINK} \\
          -e db-migrate \'S3_BUCKET\' ${S3_BUCKET} \\
          -e db-migrate \'AUTO_APPROVE_TRIP_CHANGE_REQUEST\' ${AUTO_APPROVE_TRIP_CHANGE_REQUEST} \\
          -e db-migrate \'AUTO_APPROVE_TRIP_CANCEL_REQUEST\' ${AUTO_APPROVE_TRIP_CANCEL_REQUEST} \\
          -e db-migrate \'CHANGE_TIME_CHECK_IN\' ${CHANGE_TIME_CHECK_IN} \\
          -e db-migrate \'CHANGE_TIME_CHECK_OUT\' ${CHANGE_TIME_CHECK_OUT} \\
          -e db-migrate \'CANCEL_TIME_CHECK_IN\' ${CANCEL_TIME_CHECK_IN} \\
          -e db-migrate \'CANCEL_TIME_CHECK_OUT\' ${CANCEL_TIME_CHECK_OUT} \\
          -e db-migrate \'ONBOARD_PASSENGER_TIME\' ${ONBOARD_PASSENGER_TIME} \\
          -e db-migrate \'CLUSTERING_SERVICE_URL\' ${CLUSTERING_SERVICE_URL} \\
          -e db-migrate \'CLUSTER_ALGORITHM\' ${CLUSTER_ALGORITHM} \\
          -e db-migrate \'S3_HOST_NAME\' ${S3_HOST_NAME} \\
          -e db-migrate \'SITE_NAME\' ${SITE_NAME} \\
          -e db-migrate \'NEW_RELIC_license_key\' ${NEW_RELIC_license_key} \\
          -e db-migrate \'NEW_RELIC_app_name\' ${NEW_RELIC_app_name} \\
          -e db-migrate \'NEW_RELIC_log_level\' ${NEW_RELIC_log_level} \\
          -e db-migrate \'NEW_RELIC_monitor_mode\' ${NEW_RELIC_monitor_mode} \\
          -e db-migrate \'DRIVER_APP_LINK\' ${DRIVER_APP_LINK} \\
          -e location_service \'LOCATION_DATABASE_URL\' ${DATABASE_USERNAME}\':\'${DATABASE_PASSWORD}\'@tcp(\'${DATABASE_HOST}\':\'${DATABASE_PORT}\')/\'${DATABASE_NAME}\'?parseTime=true\' \\
          -e clustering_core \'CLUSTERING_DATABASE_URL\' ${DATABASE_USERNAME}\':\'${DATABASE_PASSWORD}\'@tcp(\'${DATABASE_HOST}\':\'${DATABASE_PORT}\')/\'${DATABASE_NAME}\'?parseTime=true\' \\
          --timeout 600 && echo "IMAGE Deployed"
          
          date +"%T"
          echo "Creating RDS SNAPSHOT for ${DB_INSTANCE_IDENTIFIER} as build-${CLIENT_BUILD_NUMBER} "

          #aws rds create-db-snapshot \\
          #--db-instance-identifier ${DB_INSTANCE_IDENTIFIER} \\
          #--db-snapshot-identifier \'${DB_INSTANCE_IDENTIFIER}\'-build-\'${CLIENT_BUILD_NUMBER}'''
      }
    }
    stage('Test Clearance') {
      steps {
        script {
          try {

            test_status = input(id: 'userInput', message: 'Manual tests completed?', parameters: [[$class: 'ChoiceParameterDefinition', choices: ['Yes', 'No'].join('\n'), description: '', name: '']])
            echo "-----";
            echo test_status;
            echo "-----";
            if (test_status == "No") {
              message = input(id: 'userInput', message: 'Manual tests completed?', parameters: [[$class: 'TextParameterDefinition', defaultValue: '', description: 'Provide description if aborting pipeline', name: 'abort_reason']])
              sh 'curl --user "shunyeka:hymjug-wimta4-ceFboh" -i -H "Content-Type: application/json" -X POST --data \'{"title":"Manual test at UAT failed:", "body":$message}\' https://api.github.com/repos/MOOVE-Network/deploy-pipeline/issues'
              currentBuild.result = 'ABORTED'
              error('Aborting. Manual UAT failed')
              exit
            }
          } catch (err) {
            echo "in test confirm catch block"
            sh 'curl --user "shunyeka:hymjug-wimta4-ceFboh" -i -H "Content-Type: application/json" -X POST --data \'{"title":"Stage aborted by user", "body":"Test Clearance stage was aborted"}\' https://api.github.com/repos/MOOVE-Network/deploy-pipeline/issues'
          }
        }

      }
    }
    stage('Tag and push to Staging') {
      steps {
        sh '''echo "tag and push image to staging registry"
            sleep 10'''
      }
    }
    stage('Deploy to Staging') {
      environment {
        RAILS_ENV = 'production'
        REDIS_URL = 'redis://cache-staging.2i6os5.0001.aps1.cache.amazonaws.com:6379'
        JOB_WORKER_URL = 'redis://cache-staging.2i6os5.0001.aps1.cache.amazonaws.com:6379'
        DATABASE_NAME = 'moove_db'
        DATABASE_HOST = 'moove-staging.cjny84emnsh9.ap-south-1.rds.amazonaws.com'
        DATABASE_PORT = '3306'
        DATABASE_USERNAME = 'MOOVE_DEV'
        PROJECT_URL = 'https://github.com/MOOVE-Network/moove-webapp.git'
        PROJECT_GIT_URL = 'git@github.com:MOOVE-Network/moove-webapp.git'
        PROJECT_GIT_TARGET = 'alpha_list_oct'
        RAILS_MAX_THREADS = '10'
        FCM_TOPIC_PREFIX = 'staging'
        ANONYMOUS_APPLICATION_SID = 'APc068e4e88b11ef16b3fe94b9ca9fb779'
        EXOTEL_SID = '08039591060'
        EXOTEL_TOKEN = '31fbdf8f0a6734bd4bd1cdf1fd5e2f7f70ff3229'
        EXOTEL_CALLER_ID = '08039591060'
        OPERATOR_NUMBER = '8792656946'
        S3_ACCESS_KEY_ID = 'AKIAXAWJNTEUSEDN4A57'
        S3_SECRET_KEY = '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'
        S3_BUCKET = 'moove-assets-staging'
        S3_REGION = 'ap-south-1'
        SERVER_URL = 'staging.moove.network'
        ROLLBAR_ACCESS_TOKEN = '0025d0c26f5d4e41850ed00693cc79b8'
        BASIC_AUTH_USER = 'harman'
        BASIC_AUTH_PASSWORD = 'harman'
        SOLUTIONS_INFINI_API_KEY = 'A4fbafbca93401e6c43f7c067b58a507e'
        SOLUTIONS_INFINI_SENDER = 'iMOOVE'
        ENALBE_GUARD_PROVISIONGING = 'true'
        GEOHASH_AUTO_CLUSTERING = 'false'
        AUTO_CLUSTER = 'false'
        DATABASE_PASSWORD = 'NG$Pir7ySMJ9m&p9'
        ENABLE_LINE_MANAGER_APPROVE = 'true'
        ENABLE_TRANSPORT_DESK_MANAGER_APPROVE = 'true'
        NO_SHOW_APPROVAL_REQUIRED = 'false'
        CALCULATE_ETA = 'true'
        SEND_ANALYTICS_REPORT = 'true'
        ECS_CLUSTERNAME = 'ecs_cluster_staging'
        ECS_SERVICENAME = 'ecs_service_staging'
        ECR_REPO = '482532497705.dkr.ecr.ap-south-1.amazonaws.com/webapp'
        DB_INSTANCE_IDENTIFIER = 'mll'
        client = 'test'
        CLIENT_BUILD_NUMBER = '42'
        EMPLOYEE_ANDROID_APP_LINK = 'https://goo.gl/DZ131Z'
        EMPLOYEE_IOS_APP_LINK = 'https://goo.gl/etK6Zo'
        FCM_API_KEY = 'AAAAEXz4c6s:APA91bGE8CJdgnJQPsxgVAxM7asjVEdShM6wpq6jme5sShi4S095MdCuKOGSYuaE3AlrVYKeNrjcrfJQtIoafXabnOKI5kZOBarGkPKlo-pZah3f_iT6rvLA49CpJvx7UOf6JSzL0Zb4'
        GMAIL_USENAME = 'friend@moove.network'
        GOOGLE_MAPS_API_KEY = 'AIzaSyBL-ocE6P0pPmR6Ef4DC2BKqlnlMe1pQFk'
        PLIVO_AUTH_ID = 'MANMU4YWVJMZLIZDYWY'
        PLIVO_AUTH_TOKEN = 'YWU5YjQ5YjY2N2IxNzY2NzAyZDY2ZGY1MjkwMjc'
        S3_HOST_NAME = 's3.ap-south-1.amazonaws.com'
        AUTO_APPROVE_TRIP_CHANGE_REQUEST = 'true'
        AUTO_APPROVE_TRIP_CANCEL_REQUEST = 'false'
        CHANGE_TIME_CHECK_IN = '8.hours'
        CHANGE_TIME_CHECK_OUT = '4.hours'
        CANCEL_TIME_CHECK_IN = '4.hours'
        CANCEL_TIME_CHECK_OUT = '30.minutes'
        ONBOARD_PASSENGER_TIME = '3.minutes'
        CLUSTER_ALGORITHM = 'clustering_service'
        CLUSTERING_SERVICE_URL = 'cluster.staging.moove.network'
        ECR_CONTAINER = 'web'
        DRIVER_APP_LINK = 'https://goo.gl/BWyW9c'
        EMPLOYEE_APP_LINK = 'https://goo.gl/6x2Tmg'
        SITE_NAME = 'staging'
        NEW_RELIC_license_key = 'e1433c8ba8fd758baf4d92a82a6fb9229d95e7ac'
        NEW_RELIC_app_name = 'staging.moove.network'
        NEW_RELIC_log_level = 'info'
        NEW_RELIC_monitor_mode = 'true'
        GMAIL_PASSWORD = 'm00ve4wd'
        TWILIO_ACCOUNT_SID = 'ACf47d0b64c1d8637b1dc7f4f91d33fba0'
        TWILIO_AUTH_TOKEN = 'f9bf5de0a0553275a6aa377a8b56f7ce'
        SECRET_KEY_BASE = 'daef0f128e8c899673cbcc71b3d4854112006de625db4bab0116818c7a7dc5cae52fc531dfb5f153d1b7fb3021331de744683b0346317751115c1837cbc69672'
        LOCATION_DATABASE_URL = 'MOOVE_DEV:NG$Pir7ySMJ9m&p9@tcp(moove-staging.cjny84emnsh9.ap-south-1.rds.amazonaws.com:3306)/moove_db?parseTime=true'
        CLUSTERING_DATABASE_URL = 'MOOVE_DEV:NG$Pir7ySMJ9m&p9@tcp(moove-staging.cjny84emnsh9.ap-south-1.rds.amazonaws.com:3306)/moove_db?parseTime=true'
      }
      steps {
        sh '''#!/bin/bash
          source ~/.bash_profile
          eval $(aws ecr get-login --no-include-email | sed \'s|https://||\')
          date +"%T"
          
          echo "stopping running ecs tasks"
          stopped_task = $(aws ecs list-tasks --cluster ${ECS_CLUSTERNAME} --desired-status RUNNING --output text | awk '{print $2}')
          aws ecs stop-task --task $stopped_task
          
          echo "Deploying Image to ${ECS_CLUSTERNAME} and ${ECS_SERVICENAME} "
          #docker run ${ECR_REPO}:client-${client}-build-${CLIENT_BUILD_NUMBER}  rake db:migrate &&
          ecs deploy ${ECS_CLUSTERNAME} ${ECS_SERVICENAME} \\
          -i ${ECR_CONTAINER} ${ECR_REPO}\':build-\'${CLIENT_BUILD_NUMBER} \\
          -i sidekiq ${ECR_REPO}\':build-\'${CLIENT_BUILD_NUMBER} \\
          -i db-migrate ${ECR_REPO}\':build-\'${CLIENT_BUILD_NUMBER} \\
          -e ${ECR_CONTAINER} \'RAILS_ENV\' ${RAILS_ENV} \\
          -e ${ECR_CONTAINER} \'GMAIL_USENAME\' ${GMAIL_USENAME} \\
          -e ${ECR_CONTAINER} \'GMAIL_PASSWORD\' ${GMAIL_PASSWORD} \\
          -e ${ECR_CONTAINER} \'GOOGLE_MAPS_API_KEY\' ${GOOGLE_MAPS_API_KEY} \\
          -e ${ECR_CONTAINER} \'FCM_API_KEY\' ${FCM_API_KEY} \\
          -e ${ECR_CONTAINER} \'FCM_TOPIC_PREFIX\' ${FCM_TOPIC_PREFIX} \\
          -e ${ECR_CONTAINER} \'TWILIO_ACCOUNT_SID\' ${TWILIO_ACCOUNT_SID} \\
          -e ${ECR_CONTAINER} \'TWILIO_AUTH_TOKEN\' ${TWILIO_AUTH_TOKEN} \\
          -e ${ECR_CONTAINER} \'ANONYMOUS_APPLICATION_SID\' ${ANONYMOUS_APPLICATION_SID} \\
          -e ${ECR_CONTAINER} \'PLIVO_AUTH_ID\' ${PLIVO_AUTH_ID} \\
          -e ${ECR_CONTAINER} \'PLIVO_AUTH_TOKEN\' ${PLIVO_AUTH_TOKEN} \\
          -e ${ECR_CONTAINER} \'EXOTEL_SID\' ${EXOTEL_SID} \\
          -e ${ECR_CONTAINER} \'EXOTEL_TOKEN\' ${EXOTEL_TOKEN} \\
          -e ${ECR_CONTAINER} \'EXOTEL_CALLER_ID\' ${EXOTEL_CALLER_ID} \\
          -e ${ECR_CONTAINER} \'OPERATOR_NUMBER\' ${OPERATOR_NUMBER} \\
          -e ${ECR_CONTAINER} \'S3_ACCESS_KEY_ID\' ${S3_ACCESS_KEY_ID} \\
          -e ${ECR_CONTAINER} \'S3_SECRET_KEY\' ${S3_SECRET_KEY} \\
          -e ${ECR_CONTAINER} \'S3_BUCKET\' ${S3_BUCKET} \\
          -e ${ECR_CONTAINER} \'S3_REGION\' ${S3_REGION} \\
          -e ${ECR_CONTAINER} \'SERVER_URL\' ${SERVER_URL} \\
          -e ${ECR_CONTAINER} \'SECRET_KEY_BASE\' ${SECRET_KEY_BASE} \\
          -e ${ECR_CONTAINER} \'ROLLBAR_ACCESS_TOKEN\' ${ROLLBAR_ACCESS_TOKEN} \\
          -e ${ECR_CONTAINER} \'BASIC_AUTH_USER\' ${BASIC_AUTH_USER} \\
          -e ${ECR_CONTAINER} \'BASIC_AUTH_PASSWORD\' ${BASIC_AUTH_PASSWORD} \\
          -e ${ECR_CONTAINER} \'SOLUTIONS_INFINI_API_KEY\' ${SOLUTIONS_INFINI_API_KEY} \\
          -e ${ECR_CONTAINER} \'SOLUTIONS_INFINI_SENDER\' ${SOLUTIONS_INFINI_SENDER} \\
          -e ${ECR_CONTAINER} \'ENALBE_GUARD_PROVISIONGING\' ${ENALBE_GUARD_PROVISIONGING} \\
          -e ${ECR_CONTAINER} \'GEOHASH_AUTO_CLUSTERING\' ${GEOHASH_AUTO_CLUSTERING} \\
          -e ${ECR_CONTAINER} \'AUTO_CLUSTER\' ${AUTO_CLUSTER} \\
          -e ${ECR_CONTAINER} \'REDIS_URL\' ${REDIS_URL} \\
          -e ${ECR_CONTAINER} \'JOB_WORKER_URL\' ${JOB_WORKER_URL} \\
          -e ${ECR_CONTAINER} \'DATABASE_NAME\' ${DATABASE_NAME} \\
          -e ${ECR_CONTAINER} \'DATABASE_HOST\' ${DATABASE_HOST} \\
          -e ${ECR_CONTAINER} \'DATABASE_PORT\' ${DATABASE_PORT} \\
          -e ${ECR_CONTAINER} \'DATABASE_USERNAME\' ${DATABASE_USERNAME} \\
          -e ${ECR_CONTAINER} \'DATABASE_PASSWORD\' ${DATABASE_PASSWORD} \\
          -e ${ECR_CONTAINER} \'RAILS_MAX_THREADS\' ${RAILS_MAX_THREADS} \\
          -e ${ECR_CONTAINER} \'ENABLE_LINE_MANAGER_APPROVE\' ${ENABLE_LINE_MANAGER_APPROVE} \\
          -e ${ECR_CONTAINER} \'ENABLE_TRANSPORT_DESK_MANAGER_APPROVE\' ${ENABLE_TRANSPORT_DESK_MANAGER_APPROVE} \\
          -e ${ECR_CONTAINER} \'NO_SHOW_APPROVAL_REQUIRED\' ${NO_SHOW_APPROVAL_REQUIRED} \\
          -e ${ECR_CONTAINER} \'CALCULATE_ETA\' ${CALCULATE_ETA} \\
          -e ${ECR_CONTAINER} \'SEND_ANALYTICS_REPORT\' ${SEND_ANALYTICS_REPORT} \\
          -e ${ECR_CONTAINER} \'EMPLOYEE_ANDROID_APP_LINK\' ${EMPLOYEE_ANDROID_APP_LINK} \\
          -e ${ECR_CONTAINER} \'EMPLOYEE_IOS_APP_LINK\' ${EMPLOYEE_IOS_APP_LINK} \\
          -e ${ECR_CONTAINER} \'S3_BUCKET\' ${S3_BUCKET} \\
          -e ${ECR_CONTAINER} \'AUTO_APPROVE_TRIP_CHANGE_REQUEST\' ${AUTO_APPROVE_TRIP_CHANGE_REQUEST} \\
          -e ${ECR_CONTAINER} \'AUTO_APPROVE_TRIP_CANCEL_REQUEST\' ${AUTO_APPROVE_TRIP_CANCEL_REQUEST} \\
          -e ${ECR_CONTAINER} \'CHANGE_TIME_CHECK_IN\' ${CHANGE_TIME_CHECK_IN} \\
          -e ${ECR_CONTAINER} \'CHANGE_TIME_CHECK_OUT\' ${CHANGE_TIME_CHECK_OUT} \\
          -e ${ECR_CONTAINER} \'CANCEL_TIME_CHECK_IN\' ${CANCEL_TIME_CHECK_IN} \\
          -e ${ECR_CONTAINER} \'CANCEL_TIME_CHECK_OUT\' ${CANCEL_TIME_CHECK_OUT} \\
          -e ${ECR_CONTAINER} \'ONBOARD_PASSENGER_TIME\' ${ONBOARD_PASSENGER_TIME} \\
          -e ${ECR_CONTAINER} \'CLUSTERING_SERVICE_URL\' ${CLUSTERING_SERVICE_URL} \\
          -e ${ECR_CONTAINER} \'CLUSTER_ALGORITHM\' ${CLUSTER_ALGORITHM} \\
          -e ${ECR_CONTAINER} \'S3_HOST_NAME\' ${S3_HOST_NAME} \\
          -e ${ECR_CONTAINER} \'SITE_NAME\' ${SITE_NAME} \\
          -e ${ECR_CONTAINER} \'NEW_RELIC_license_key\' ${NEW_RELIC_license_key} \\
          -e ${ECR_CONTAINER} \'NEW_RELIC_app_name\' ${NEW_RELIC_app_name} \\
          -e ${ECR_CONTAINER} \'NEW_RELIC_log_level\' ${NEW_RELIC_log_level} \\
          -e ${ECR_CONTAINER} \'NEW_RELIC_monitor_mode\' ${NEW_RELIC_monitor_mode} \\
          -e ${ECR_CONTAINER} \'DRIVER_APP_LINK\' ${DRIVER_APP_LINK} \\
          -e sidekiq \'RAILS_ENV\' ${RAILS_ENV} \\
          -e sidekiq \'GMAIL_USENAME\' ${GMAIL_USENAME} \\
          -e sidekiq \'GMAIL_PASSWORD\' ${GMAIL_PASSWORD} \\
          -e sidekiq \'GOOGLE_MAPS_API_KEY\' ${GOOGLE_MAPS_API_KEY} \\
          -e sidekiq \'FCM_API_KEY\' ${FCM_API_KEY} \\
          -e sidekiq \'FCM_TOPIC_PREFIX\' ${FCM_TOPIC_PREFIX} \\
          -e sidekiq \'TWILIO_ACCOUNT_SID\' ${TWILIO_ACCOUNT_SID} \\
          -e sidekiq \'TWILIO_AUTH_TOKEN\' ${TWILIO_AUTH_TOKEN} \\
          -e sidekiq \'ANONYMOUS_APPLICATION_SID\' ${ANONYMOUS_APPLICATION_SID} \\
          -e sidekiq \'PLIVO_AUTH_ID\' ${PLIVO_AUTH_ID} \\
          -e sidekiq \'PLIVO_AUTH_TOKEN\' ${PLIVO_AUTH_TOKEN} \\
          -e sidekiq \'EXOTEL_SID\' ${EXOTEL_SID} \\
          -e sidekiq \'EXOTEL_TOKEN\' ${EXOTEL_TOKEN} \\
          -e sidekiq \'EXOTEL_CALLER_ID\' ${EXOTEL_CALLER_ID} \\
          -e sidekiq \'OPERATOR_NUMBER\' ${OPERATOR_NUMBER} \\
          -e sidekiq \'S3_ACCESS_KEY_ID\' ${S3_ACCESS_KEY_ID} \\
          -e sidekiq \'S3_SECRET_KEY\' ${S3_SECRET_KEY} \\
          -e sidekiq \'S3_BUCKET\' ${S3_BUCKET} \\
          -e sidekiq \'S3_REGION\' ${S3_REGION} \\
          -e sidekiq \'SERVER_URL\' ${SERVER_URL} \\
          -e sidekiq \'SECRET_KEY_BASE\' ${SECRET_KEY_BASE} \\
          -e sidekiq \'ROLLBAR_ACCESS_TOKEN\' ${ROLLBAR_ACCESS_TOKEN} \\
          -e sidekiq \'BASIC_AUTH_USER\' ${BASIC_AUTH_USER} \\
          -e sidekiq \'BASIC_AUTH_PASSWORD\' ${BASIC_AUTH_PASSWORD} \\
          -e sidekiq \'SOLUTIONS_INFINI_API_KEY\' ${SOLUTIONS_INFINI_API_KEY} \\
          -e sidekiq \'SOLUTIONS_INFINI_SENDER\' ${SOLUTIONS_INFINI_SENDER} \\
          -e sidekiq \'ENALBE_GUARD_PROVISIONGING\' ${ENALBE_GUARD_PROVISIONGING} \\
          -e sidekiq \'GEOHASH_AUTO_CLUSTERING\' ${GEOHASH_AUTO_CLUSTERING} \\
          -e sidekiq \'AUTO_CLUSTER\' ${AUTO_CLUSTER} \\
          -e sidekiq \'REDIS_URL\' ${REDIS_URL} \\
          -e sidekiq \'JOB_WORKER_URL\' ${JOB_WORKER_URL} \\
          -e sidekiq \'DATABASE_NAME\' ${DATABASE_NAME} \\
          -e sidekiq \'DATABASE_HOST\' ${DATABASE_HOST} \\
          -e sidekiq \'DATABASE_PORT\' ${DATABASE_PORT} \\
          -e sidekiq \'DATABASE_USERNAME\' ${DATABASE_USERNAME} \\
          -e sidekiq \'DATABASE_PASSWORD\' ${DATABASE_PASSWORD} \\
          -e sidekiq \'RAILS_MAX_THREADS\' ${RAILS_MAX_THREADS} \\
          -e sidekiq \'ENABLE_LINE_MANAGER_APPROVE\' ${ENABLE_LINE_MANAGER_APPROVE} \\
          -e sidekiq \'ENABLE_TRANSPORT_DESK_MANAGER_APPROVE\' ${ENABLE_TRANSPORT_DESK_MANAGER_APPROVE} \\
          -e sidekiq \'NO_SHOW_APPROVAL_REQUIRED\' ${NO_SHOW_APPROVAL_REQUIRED} \\
          -e sidekiq \'CALCULATE_ETA\' ${CALCULATE_ETA} \\
          -e sidekiq \'SEND_ANALYTICS_REPORT\' ${SEND_ANALYTICS_REPORT} \\
          -e sidekiq \'EMPLOYEE_ANDROID_APP_LINK\' ${EMPLOYEE_ANDROID_APP_LINK} \\
          -e sidekiq \'EMPLOYEE_IOS_APP_LINK\' ${EMPLOYEE_IOS_APP_LINK} \\
          -e sidekiq \'S3_BUCKET\' ${S3_BUCKET} \\
          -e sidekiq \'AUTO_APPROVE_TRIP_CHANGE_REQUEST\' ${AUTO_APPROVE_TRIP_CHANGE_REQUEST} \\
          -e sidekiq \'AUTO_APPROVE_TRIP_CANCEL_REQUEST\' ${AUTO_APPROVE_TRIP_CANCEL_REQUEST} \\
          -e sidekiq \'CHANGE_TIME_CHECK_IN\' ${CHANGE_TIME_CHECK_IN} \\
          -e sidekiq \'CHANGE_TIME_CHECK_OUT\' ${CHANGE_TIME_CHECK_OUT} \\
          -e sidekiq \'CANCEL_TIME_CHECK_IN\' ${CANCEL_TIME_CHECK_IN} \\
          -e sidekiq \'CANCEL_TIME_CHECK_OUT\' ${CANCEL_TIME_CHECK_OUT} \\
          -e sidekiq \'ONBOARD_PASSENGER_TIME\' ${ONBOARD_PASSENGER_TIME} \\
          -e sidekiq \'CLUSTERING_SERVICE_URL\' ${CLUSTERING_SERVICE_URL} \\
          -e sidekiq \'CLUSTER_ALGORITHM\' ${CLUSTER_ALGORITHM} \\
          -e sidekiq \'S3_HOST_NAME\' ${S3_HOST_NAME} \\
          -e sidekiq \'SITE_NAME\' ${SITE_NAME} \\
          -e sidekiq \'NEW_RELIC_license_key\' ${NEW_RELIC_license_key} \\
          -e sidekiq \'NEW_RELIC_app_name\' ${NEW_RELIC_app_name} \\
          -e sidekiq \'NEW_RELIC_log_level\' ${NEW_RELIC_log_level} \\
          -e sidekiq \'NEW_RELIC_monitor_mode\' ${NEW_RELIC_monitor_mode} \\
          -e sidekiq \'DRIVER_APP_LINK\' ${DRIVER_APP_LINK} \\
          -e db-migrate \'RAILS_ENV\' ${RAILS_ENV} \\
          -e db-migrate \'GMAIL_USENAME\' ${GMAIL_USENAME} \\
          -e db-migrate \'GMAIL_PASSWORD\' ${GMAIL_PASSWORD} \\
          -e db-migrate \'GOOGLE_MAPS_API_KEY\' ${GOOGLE_MAPS_API_KEY} \\
          -e db-migrate \'FCM_API_KEY\' ${FCM_API_KEY} \\
          -e db-migrate \'FCM_TOPIC_PREFIX\' ${FCM_TOPIC_PREFIX} \\
          -e db-migrate \'TWILIO_ACCOUNT_SID\' ${TWILIO_ACCOUNT_SID} \\
          -e db-migrate \'TWILIO_AUTH_TOKEN\' ${TWILIO_AUTH_TOKEN} \\
          -e db-migrate \'ANONYMOUS_APPLICATION_SID\' ${ANONYMOUS_APPLICATION_SID} \\
          -e db-migrate \'PLIVO_AUTH_ID\' ${PLIVO_AUTH_ID} \\
          -e db-migrate \'PLIVO_AUTH_TOKEN\' ${PLIVO_AUTH_TOKEN} \\
          -e db-migrate \'EXOTEL_SID\' ${EXOTEL_SID} \\
          -e db-migrate \'EXOTEL_TOKEN\' ${EXOTEL_TOKEN} \\
          -e db-migrate \'EXOTEL_CALLER_ID\' ${EXOTEL_CALLER_ID} \\
          -e db-migrate \'OPERATOR_NUMBER\' ${OPERATOR_NUMBER} \\
          -e db-migrate \'S3_ACCESS_KEY_ID\' ${S3_ACCESS_KEY_ID} \\
          -e db-migrate \'S3_SECRET_KEY\' ${S3_SECRET_KEY} \\
          -e db-migrate \'S3_BUCKET\' ${S3_BUCKET} \\
          -e db-migrate \'S3_REGION\' ${S3_REGION} \\
          -e db-migrate \'SERVER_URL\' ${SERVER_URL} \\
          -e db-migrate \'SECRET_KEY_BASE\' ${SECRET_KEY_BASE} \\
          -e db-migrate \'ROLLBAR_ACCESS_TOKEN\' ${ROLLBAR_ACCESS_TOKEN} \\
          -e db-migrate \'BASIC_AUTH_USER\' ${BASIC_AUTH_USER} \\
          -e db-migrate \'BASIC_AUTH_PASSWORD\' ${BASIC_AUTH_PASSWORD} \\
          -e db-migrate \'SOLUTIONS_INFINI_API_KEY\' ${SOLUTIONS_INFINI_API_KEY} \\
          -e db-migrate \'SOLUTIONS_INFINI_SENDER\' ${SOLUTIONS_INFINI_SENDER} \\
          -e db-migrate \'ENALBE_GUARD_PROVISIONGING\' ${ENALBE_GUARD_PROVISIONGING} \\
          -e db-migrate \'GEOHASH_AUTO_CLUSTERING\' ${GEOHASH_AUTO_CLUSTERING} \\
          -e db-migrate \'AUTO_CLUSTER\' ${AUTO_CLUSTER} \\
          -e db-migrate \'REDIS_URL\' ${REDIS_URL} \\
          -e db-migrate \'JOB_WORKER_URL\' ${JOB_WORKER_URL} \\
          -e db-migrate \'DATABASE_NAME\' ${DATABASE_NAME} \\
          -e db-migrate \'DATABASE_HOST\' ${DATABASE_HOST} \\
          -e db-migrate \'DATABASE_PORT\' ${DATABASE_PORT} \\
          -e db-migrate \'DATABASE_USERNAME\' ${DATABASE_USERNAME} \\
          -e db-migrate \'DATABASE_PASSWORD\' ${DATABASE_PASSWORD} \\
          -e db-migrate \'RAILS_MAX_THREADS\' ${RAILS_MAX_THREADS} \\
          -e db-migrate \'ENABLE_LINE_MANAGER_APPROVE\' ${ENABLE_LINE_MANAGER_APPROVE} \\
          -e db-migrate \'ENABLE_TRANSPORT_DESK_MANAGER_APPROVE\' ${ENABLE_TRANSPORT_DESK_MANAGER_APPROVE} \\
          -e db-migrate \'NO_SHOW_APPROVAL_REQUIRED\' ${NO_SHOW_APPROVAL_REQUIRED} \\
          -e db-migrate \'CALCULATE_ETA\' ${CALCULATE_ETA} \\
          -e db-migrate \'SEND_ANALYTICS_REPORT\' ${SEND_ANALYTICS_REPORT} \\
          -e db-migrate \'EMPLOYEE_ANDROID_APP_LINK\' ${EMPLOYEE_ANDROID_APP_LINK} \\
          -e db-migrate \'EMPLOYEE_IOS_APP_LINK\' ${EMPLOYEE_IOS_APP_LINK} \\
          -e db-migrate \'S3_BUCKET\' ${S3_BUCKET} \\
          -e db-migrate \'AUTO_APPROVE_TRIP_CHANGE_REQUEST\' ${AUTO_APPROVE_TRIP_CHANGE_REQUEST} \\
          -e db-migrate \'AUTO_APPROVE_TRIP_CANCEL_REQUEST\' ${AUTO_APPROVE_TRIP_CANCEL_REQUEST} \\
          -e db-migrate \'CHANGE_TIME_CHECK_IN\' ${CHANGE_TIME_CHECK_IN} \\
          -e db-migrate \'CHANGE_TIME_CHECK_OUT\' ${CHANGE_TIME_CHECK_OUT} \\
          -e db-migrate \'CANCEL_TIME_CHECK_IN\' ${CANCEL_TIME_CHECK_IN} \\
          -e db-migrate \'CANCEL_TIME_CHECK_OUT\' ${CANCEL_TIME_CHECK_OUT} \\
          -e db-migrate \'ONBOARD_PASSENGER_TIME\' ${ONBOARD_PASSENGER_TIME} \\
          -e db-migrate \'CLUSTERING_SERVICE_URL\' ${CLUSTERING_SERVICE_URL} \\
          -e db-migrate \'CLUSTER_ALGORITHM\' ${CLUSTER_ALGORITHM} \\
          -e db-migrate \'S3_HOST_NAME\' ${S3_HOST_NAME} \\
          -e db-migrate \'SITE_NAME\' ${SITE_NAME} \\
          -e db-migrate \'NEW_RELIC_license_key\' ${NEW_RELIC_license_key} \\
          -e db-migrate \'NEW_RELIC_app_name\' ${NEW_RELIC_app_name} \\
          -e db-migrate \'NEW_RELIC_log_level\' ${NEW_RELIC_log_level} \\
          -e db-migrate \'NEW_RELIC_monitor_mode\' ${NEW_RELIC_monitor_mode} \\
          -e db-migrate \'DRIVER_APP_LINK\' ${DRIVER_APP_LINK} \\
          -e location_service \'LOCATION_DATABASE_URL\' ${DATABASE_USERNAME}\':\'${DATABASE_PASSWORD}\'@tcp(\'${DATABASE_HOST}\':\'${DATABASE_PORT}\')/\'${DATABASE_NAME}\'?parseTime=true\' \\
          -e clustering_core \'CLUSTERING_DATABASE_URL\' ${DATABASE_USERNAME}\':\'${DATABASE_PASSWORD}\'@tcp(\'${DATABASE_HOST}\':\'${DATABASE_PORT}\')/\'${DATABASE_NAME}\'?parseTime=true\' \\
          --timeout 600 && echo "IMAGE Deployed"
          date +"%T"
          echo "Creating RDS SNAPSHOT for ${DB_INSTANCE_IDENTIFIER} as build-${CLIENT_BUILD_NUMBER} "
          #aws rds create-db-snapshot \\
          #--db-instance-identifier ${DB_INSTANCE_IDENTIFIER} \\
          #--db-snapshot-identifier \'${DB_INSTANCE_IDENTIFIER}\'-build-\'${CLIENT_BUILD_NUMBER}'''
      }
    }
    stage('Staging Clearance') {
      steps {
        script {
          try {
            test_status = input(id: 'userInput', message: 'Manual tests completed?', parameters: [[$class: 'ChoiceParameterDefinition', choices: ['Yes', 'No'].join('\n'), description: '', name: '']])
            echo "-----";
            echo test_status;
            echo "-----";
            if (test_status == "No") {
              message = input(id: 'userInput', message: 'What tests failed?', parameters: [[$class: 'TextParameterDefinition', defaultValue: '', description: 'Provide description if aborting pipeline', name: 'abort_reason']])
              sh 'curl --user "shunyeka:hymjug-wimta4-ceFboh" -i -H "Content-Type: application/json" -X POST --data \'{"title":"Manual test at staging failed:", "body":$message}\' https://api.github.com/repos/MOOVE-Network/deploy-pipeline/issues'
              currentBuild.result = 'ABORTED'
              error('Aborting. Manual staging test failed')
              exit
            }
          } catch (err) {
            echo "in test confirm catch block"
            sh 'curl --user "shunyeka:hymjug-wimta4-ceFboh" -i -H "Content-Type: application/json" -X POST --data \'{"title":"Stageing test aborted by user", "body":"Test Clearance stage was aborted"}\' https://api.github.com/repos/MOOVE-Network/deploy-pipeline/issues'
          }
        }

      }
    }
    stage('tag and push to production') {
      steps {
        sh '''echo "Tag and push image to production registry"
          sleep 10'''
      }
    }
    stage('Approval for production') {
      steps {
        script {
          try {
            test_status = input(id: 'userInput', message: 'Manual tests completed?', parameters: [[$class: 'ChoiceParameterDefinition', choices: ['Yes', 'No'].join('\n'), description: '', name: '']])
            echo "-----";
            echo test_status;
            echo "-----";
            if (test_status == "No") {
              message = input(id: 'userInput', message: 'What tests failed?', parameters: [[$class: 'TextParameterDefinition', defaultValue: '', description: 'Provide description if aborting pipeline', name: 'abort_reason']])
              sh 'curl --user "shunyeka:hymjug-wimta4-ceFboh" -i -H "Content-Type: application/json" -X POST --data \'{"title":"Manual test at production failed:", "body":$message}\' https://api.github.com/repos/MOOVE-Network/deploy-pipeline/issues'
              currentBuild.result = 'ABORTED'
              error('Aborting. Manual Production failed')
              exit
            }
          } catch (err) {
            echo "in test confirm catch block"
            sh 'curl --user "shunyeka:hymjug-wimta4-ceFboh" -i -H "Content-Type: application/json" -X POST --data \'{"title":"Stage aborted by user", "body":"Test Clearance stage was aborted"}\' https://api.github.com/repos/MOOVE-Network/deploy-pipeline/issues'
          }
        }

      }
    }
    stage('Deploy to production') {
      environment {
        RAILS_ENV = 'production'
        REDIS_URL = 'redis://cache-production.2i6os5.0001.aps1.cache.amazonaws.com:6379'
        JOB_WORKER_URL = 'redis://cache-production.2i6os5.0001.aps1.cache.amazonaws.com:6379'
        DATABASE_NAME = 'moove_db'
        DATABASE_HOST = 'moove-production.cjny84emnsh9.ap-south-1.rds.amazonaws.com'
        DATABASE_PORT = '3306'
        DATABASE_USERNAME = 'MOOVE_DEV'
        PROJECT_URL = 'https://github.com/MOOVE-Network/moove-webapp.git'
        PROJECT_GIT_URL = 'git@github.com:MOOVE-Network/moove-webapp.git'
        PROJECT_GIT_TARGET = 'alpha_list_oct'
        RAILS_MAX_THREADS = '10'
        FCM_TOPIC_PREFIX = 'production'
        ANONYMOUS_APPLICATION_SID = 'APc068e4e88b11ef16b3fe94b9ca9fb779'
        EXOTEL_SID = '08039591060'
        EXOTEL_TOKEN = '31fbdf8f0a6734bd4bd1cdf1fd5e2f7f70ff3229'
        EXOTEL_CALLER_ID = '08039591060'
        OPERATOR_NUMBER = '8792656946'
        S3_ACCESS_KEY_ID = 'AKIAXAWJNTEUSEDN4A57'
        S3_SECRET_KEY = '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'
        S3_BUCKET = 'moove-assets-production'
        S3_REGION = 'ap-south-1'
        SERVER_URL = 'production.moove.network'
        ROLLBAR_ACCESS_TOKEN = '0025d0c26f5d4e41850ed00693cc79b8'
        BASIC_AUTH_USER = 'harman'
        BASIC_AUTH_PASSWORD = 'harman'
        SOLUTIONS_INFINI_API_KEY = 'A4fbafbca93401e6c43f7c067b58a507e'
        SOLUTIONS_INFINI_SENDER = 'iMOOVE'
        ENALBE_GUARD_PROVISIONGING = 'true'
        GEOHASH_AUTO_CLUSTERING = 'false'
        AUTO_CLUSTER = 'false'
        DATABASE_PASSWORD = 'NG$Pir7ySMJ9m&p9'
        ENABLE_LINE_MANAGER_APPROVE = 'true'
        ENABLE_TRANSPORT_DESK_MANAGER_APPROVE = 'true'
        NO_SHOW_APPROVAL_REQUIRED = 'false'
        CALCULATE_ETA = 'true'
        SEND_ANALYTICS_REPORT = 'true'
        ECS_CLUSTERNAME = 'ecs_cluster_production'
        ECS_SERVICENAME = 'ecs_service_production'
        ECR_REPO = '482532497705.dkr.ecr.ap-south-1.amazonaws.com/webapp'
        DB_INSTANCE_IDENTIFIER = 'mll'
        client = 'test'
        CLIENT_BUILD_NUMBER = '42'
        EMPLOYEE_ANDROID_APP_LINK = 'https://goo.gl/DZ131Z'
        EMPLOYEE_IOS_APP_LINK = 'https://goo.gl/etK6Zo'
        FCM_API_KEY = 'AAAAEXz4c6s:APA91bGE8CJdgnJQPsxgVAxM7asjVEdShM6wpq6jme5sShi4S095MdCuKOGSYuaE3AlrVYKeNrjcrfJQtIoafXabnOKI5kZOBarGkPKlo-pZah3f_iT6rvLA49CpJvx7UOf6JSzL0Zb4'
        GMAIL_USENAME = 'friend@moove.network'
        GOOGLE_MAPS_API_KEY = 'AIzaSyBL-ocE6P0pPmR6Ef4DC2BKqlnlMe1pQFk'
        PLIVO_AUTH_ID = 'MANMU4YWVJMZLIZDYWY'
        PLIVO_AUTH_TOKEN = 'YWU5YjQ5YjY2N2IxNzY2NzAyZDY2ZGY1MjkwMjc'
        S3_HOST_NAME = 's3.ap-south-1.amazonaws.com'
        AUTO_APPROVE_TRIP_CHANGE_REQUEST = 'true'
        AUTO_APPROVE_TRIP_CANCEL_REQUEST = 'false'
        CHANGE_TIME_CHECK_IN = '8.hours'
        CHANGE_TIME_CHECK_OUT = '4.hours'
        CANCEL_TIME_CHECK_IN = '4.hours'
        CANCEL_TIME_CHECK_OUT = '30.minutes'
        ONBOARD_PASSENGER_TIME = '3.minutes'
        CLUSTER_ALGORITHM = 'clustering_service'
        CLUSTERING_SERVICE_URL = 'cluster.production.moove.network'
        ECR_CONTAINER = 'web'
        DRIVER_APP_LINK = 'https://goo.gl/BWyW9c'
        EMPLOYEE_APP_LINK = 'https://goo.gl/6x2Tmg'
        SITE_NAME = 'production'
        NEW_RELIC_license_key = 'e1433c8ba8fd758baf4d92a82a6fb9229d95e7ac'
        NEW_RELIC_app_name = 'production.moove.network'
        NEW_RELIC_log_level = 'info'
        NEW_RELIC_monitor_mode = 'true'
        GMAIL_PASSWORD = 'm00ve4wd'
        TWILIO_ACCOUNT_SID = 'ACf47d0b64c1d8637b1dc7f4f91d33fba0'
        TWILIO_AUTH_TOKEN = 'f9bf5de0a0553275a6aa377a8b56f7ce'
        SECRET_KEY_BASE = 'daef0f128e8c899673cbcc71b3d4854112006de625db4bab0116818c7a7dc5cae52fc531dfb5f153d1b7fb3021331de744683b0346317751115c1837cbc69672'
        LOCATION_DATABASE_URL = 'MOOVE_DEV:NG$Pir7ySMJ9m&p9@tcp(moove-production.cjny84emnsh9.ap-south-1.rds.amazonaws.com:3306)/moove_db?parseTime=true'
        CLUSTERING_DATABASE_URL = 'MOOVE_DEV:NG$Pir7ySMJ9m&p9@tcp(moove-production.cjny84emnsh9.ap-south-1.rds.amazonaws.com:3306)/moove_db?parseTime=true'
      }
      steps {
        sh '''#!/bin/bash
          source ~/.bash_profile
          eval $(aws ecr get-login --no-include-email | sed \'s|https://||\')
          date +"%T"
          
          echo "stopping running ecs tasks"
          stopped_task = $(aws ecs list-tasks --cluster ${ECS_CLUSTERNAME} --desired-status RUNNING --output text | awk '{print $2}')
          aws ecs stop-task --task $stopped_task
          
          echo "Deploying Image to ${ECS_CLUSTERNAME} and ${ECS_SERVICENAME} "
          #docker run ${ECR_REPO}:client-${client}-build-${CLIENT_BUILD_NUMBER}  rake db:migrate &&
          ecs deploy ${ECS_CLUSTERNAME} ${ECS_SERVICENAME} \\
          -i ${ECR_CONTAINER} ${ECR_REPO}\':build-\'${CLIENT_BUILD_NUMBER} \\
          -i sidekiq ${ECR_REPO}\':build-\'${CLIENT_BUILD_NUMBER} \\
          -i db-migrate ${ECR_REPO}\':build-\'${CLIENT_BUILD_NUMBER} \\
          -e ${ECR_CONTAINER} \'RAILS_ENV\' ${RAILS_ENV} \\
          -e ${ECR_CONTAINER} \'GMAIL_USENAME\' ${GMAIL_USENAME} \\
          -e ${ECR_CONTAINER} \'GMAIL_PASSWORD\' ${GMAIL_PASSWORD} \\
          -e ${ECR_CONTAINER} \'GOOGLE_MAPS_API_KEY\' ${GOOGLE_MAPS_API_KEY} \\
          -e ${ECR_CONTAINER} \'FCM_API_KEY\' ${FCM_API_KEY} \\
          -e ${ECR_CONTAINER} \'FCM_TOPIC_PREFIX\' ${FCM_TOPIC_PREFIX} \\
          -e ${ECR_CONTAINER} \'TWILIO_ACCOUNT_SID\' ${TWILIO_ACCOUNT_SID} \\
          -e ${ECR_CONTAINER} \'TWILIO_AUTH_TOKEN\' ${TWILIO_AUTH_TOKEN} \\
          -e ${ECR_CONTAINER} \'ANONYMOUS_APPLICATION_SID\' ${ANONYMOUS_APPLICATION_SID} \\
          -e ${ECR_CONTAINER} \'PLIVO_AUTH_ID\' ${PLIVO_AUTH_ID} \\
          -e ${ECR_CONTAINER} \'PLIVO_AUTH_TOKEN\' ${PLIVO_AUTH_TOKEN} \\
          -e ${ECR_CONTAINER} \'EXOTEL_SID\' ${EXOTEL_SID} \\
          -e ${ECR_CONTAINER} \'EXOTEL_TOKEN\' ${EXOTEL_TOKEN} \\
          -e ${ECR_CONTAINER} \'EXOTEL_CALLER_ID\' ${EXOTEL_CALLER_ID} \\
          -e ${ECR_CONTAINER} \'OPERATOR_NUMBER\' ${OPERATOR_NUMBER} \\
          -e ${ECR_CONTAINER} \'S3_ACCESS_KEY_ID\' ${S3_ACCESS_KEY_ID} \\
          -e ${ECR_CONTAINER} \'S3_SECRET_KEY\' ${S3_SECRET_KEY} \\
          -e ${ECR_CONTAINER} \'S3_BUCKET\' ${S3_BUCKET} \\
          -e ${ECR_CONTAINER} \'S3_REGION\' ${S3_REGION} \\
          -e ${ECR_CONTAINER} \'SERVER_URL\' ${SERVER_URL} \\
          -e ${ECR_CONTAINER} \'SECRET_KEY_BASE\' ${SECRET_KEY_BASE} \\
          -e ${ECR_CONTAINER} \'ROLLBAR_ACCESS_TOKEN\' ${ROLLBAR_ACCESS_TOKEN} \\
          -e ${ECR_CONTAINER} \'BASIC_AUTH_USER\' ${BASIC_AUTH_USER} \\
          -e ${ECR_CONTAINER} \'BASIC_AUTH_PASSWORD\' ${BASIC_AUTH_PASSWORD} \\
          -e ${ECR_CONTAINER} \'SOLUTIONS_INFINI_API_KEY\' ${SOLUTIONS_INFINI_API_KEY} \\
          -e ${ECR_CONTAINER} \'SOLUTIONS_INFINI_SENDER\' ${SOLUTIONS_INFINI_SENDER} \\
          -e ${ECR_CONTAINER} \'ENALBE_GUARD_PROVISIONGING\' ${ENALBE_GUARD_PROVISIONGING} \\
          -e ${ECR_CONTAINER} \'GEOHASH_AUTO_CLUSTERING\' ${GEOHASH_AUTO_CLUSTERING} \\
          -e ${ECR_CONTAINER} \'AUTO_CLUSTER\' ${AUTO_CLUSTER} \\
          -e ${ECR_CONTAINER} \'REDIS_URL\' ${REDIS_URL} \\
          -e ${ECR_CONTAINER} \'JOB_WORKER_URL\' ${JOB_WORKER_URL} \\
          -e ${ECR_CONTAINER} \'DATABASE_NAME\' ${DATABASE_NAME} \\
          -e ${ECR_CONTAINER} \'DATABASE_HOST\' ${DATABASE_HOST} \\
          -e ${ECR_CONTAINER} \'DATABASE_PORT\' ${DATABASE_PORT} \\
          -e ${ECR_CONTAINER} \'DATABASE_USERNAME\' ${DATABASE_USERNAME} \\
          -e ${ECR_CONTAINER} \'DATABASE_PASSWORD\' ${DATABASE_PASSWORD} \\
          -e ${ECR_CONTAINER} \'RAILS_MAX_THREADS\' ${RAILS_MAX_THREADS} \\
          -e ${ECR_CONTAINER} \'ENABLE_LINE_MANAGER_APPROVE\' ${ENABLE_LINE_MANAGER_APPROVE} \\
          -e ${ECR_CONTAINER} \'ENABLE_TRANSPORT_DESK_MANAGER_APPROVE\' ${ENABLE_TRANSPORT_DESK_MANAGER_APPROVE} \\
          -e ${ECR_CONTAINER} \'NO_SHOW_APPROVAL_REQUIRED\' ${NO_SHOW_APPROVAL_REQUIRED} \\
          -e ${ECR_CONTAINER} \'CALCULATE_ETA\' ${CALCULATE_ETA} \\
          -e ${ECR_CONTAINER} \'SEND_ANALYTICS_REPORT\' ${SEND_ANALYTICS_REPORT} \\
          -e ${ECR_CONTAINER} \'EMPLOYEE_ANDROID_APP_LINK\' ${EMPLOYEE_ANDROID_APP_LINK} \\
          -e ${ECR_CONTAINER} \'EMPLOYEE_IOS_APP_LINK\' ${EMPLOYEE_IOS_APP_LINK} \\
          -e ${ECR_CONTAINER} \'S3_BUCKET\' ${S3_BUCKET} \\
          -e ${ECR_CONTAINER} \'AUTO_APPROVE_TRIP_CHANGE_REQUEST\' ${AUTO_APPROVE_TRIP_CHANGE_REQUEST} \\
          -e ${ECR_CONTAINER} \'AUTO_APPROVE_TRIP_CANCEL_REQUEST\' ${AUTO_APPROVE_TRIP_CANCEL_REQUEST} \\
          -e ${ECR_CONTAINER} \'CHANGE_TIME_CHECK_IN\' ${CHANGE_TIME_CHECK_IN} \\
          -e ${ECR_CONTAINER} \'CHANGE_TIME_CHECK_OUT\' ${CHANGE_TIME_CHECK_OUT} \\
          -e ${ECR_CONTAINER} \'CANCEL_TIME_CHECK_IN\' ${CANCEL_TIME_CHECK_IN} \\
          -e ${ECR_CONTAINER} \'CANCEL_TIME_CHECK_OUT\' ${CANCEL_TIME_CHECK_OUT} \\
          -e ${ECR_CONTAINER} \'ONBOARD_PASSENGER_TIME\' ${ONBOARD_PASSENGER_TIME} \\
          -e ${ECR_CONTAINER} \'CLUSTERING_SERVICE_URL\' ${CLUSTERING_SERVICE_URL} \\
          -e ${ECR_CONTAINER} \'CLUSTER_ALGORITHM\' ${CLUSTER_ALGORITHM} \\
          -e ${ECR_CONTAINER} \'S3_HOST_NAME\' ${S3_HOST_NAME} \\
          -e ${ECR_CONTAINER} \'SITE_NAME\' ${SITE_NAME} \\
          -e ${ECR_CONTAINER} \'NEW_RELIC_license_key\' ${NEW_RELIC_license_key} \\
          -e ${ECR_CONTAINER} \'NEW_RELIC_app_name\' ${NEW_RELIC_app_name} \\
          -e ${ECR_CONTAINER} \'NEW_RELIC_log_level\' ${NEW_RELIC_log_level} \\
          -e ${ECR_CONTAINER} \'NEW_RELIC_monitor_mode\' ${NEW_RELIC_monitor_mode} \\
          -e ${ECR_CONTAINER} \'DRIVER_APP_LINK\' ${DRIVER_APP_LINK} \\
          -e sidekiq \'RAILS_ENV\' ${RAILS_ENV} \\
          -e sidekiq \'GMAIL_USENAME\' ${GMAIL_USENAME} \\
          -e sidekiq \'GMAIL_PASSWORD\' ${GMAIL_PASSWORD} \\
          -e sidekiq \'GOOGLE_MAPS_API_KEY\' ${GOOGLE_MAPS_API_KEY} \\
          -e sidekiq \'FCM_API_KEY\' ${FCM_API_KEY} \\
          -e sidekiq \'FCM_TOPIC_PREFIX\' ${FCM_TOPIC_PREFIX} \\
          -e sidekiq \'TWILIO_ACCOUNT_SID\' ${TWILIO_ACCOUNT_SID} \\
          -e sidekiq \'TWILIO_AUTH_TOKEN\' ${TWILIO_AUTH_TOKEN} \\
          -e sidekiq \'ANONYMOUS_APPLICATION_SID\' ${ANONYMOUS_APPLICATION_SID} \\
          -e sidekiq \'PLIVO_AUTH_ID\' ${PLIVO_AUTH_ID} \\
          -e sidekiq \'PLIVO_AUTH_TOKEN\' ${PLIVO_AUTH_TOKEN} \\
          -e sidekiq \'EXOTEL_SID\' ${EXOTEL_SID} \\
          -e sidekiq \'EXOTEL_TOKEN\' ${EXOTEL_TOKEN} \\
          -e sidekiq \'EXOTEL_CALLER_ID\' ${EXOTEL_CALLER_ID} \\
          -e sidekiq \'OPERATOR_NUMBER\' ${OPERATOR_NUMBER} \\
          -e sidekiq \'S3_ACCESS_KEY_ID\' ${S3_ACCESS_KEY_ID} \\
          -e sidekiq \'S3_SECRET_KEY\' ${S3_SECRET_KEY} \\
          -e sidekiq \'S3_BUCKET\' ${S3_BUCKET} \\
          -e sidekiq \'S3_REGION\' ${S3_REGION} \\
          -e sidekiq \'SERVER_URL\' ${SERVER_URL} \\
          -e sidekiq \'SECRET_KEY_BASE\' ${SECRET_KEY_BASE} \\
          -e sidekiq \'ROLLBAR_ACCESS_TOKEN\' ${ROLLBAR_ACCESS_TOKEN} \\
          -e sidekiq \'BASIC_AUTH_USER\' ${BASIC_AUTH_USER} \\
          -e sidekiq \'BASIC_AUTH_PASSWORD\' ${BASIC_AUTH_PASSWORD} \\
          -e sidekiq \'SOLUTIONS_INFINI_API_KEY\' ${SOLUTIONS_INFINI_API_KEY} \\
          -e sidekiq \'SOLUTIONS_INFINI_SENDER\' ${SOLUTIONS_INFINI_SENDER} \\
          -e sidekiq \'ENALBE_GUARD_PROVISIONGING\' ${ENALBE_GUARD_PROVISIONGING} \\
          -e sidekiq \'GEOHASH_AUTO_CLUSTERING\' ${GEOHASH_AUTO_CLUSTERING} \\
          -e sidekiq \'AUTO_CLUSTER\' ${AUTO_CLUSTER} \\
          -e sidekiq \'REDIS_URL\' ${REDIS_URL} \\
          -e sidekiq \'JOB_WORKER_URL\' ${JOB_WORKER_URL} \\
          -e sidekiq \'DATABASE_NAME\' ${DATABASE_NAME} \\
          -e sidekiq \'DATABASE_HOST\' ${DATABASE_HOST} \\
          -e sidekiq \'DATABASE_PORT\' ${DATABASE_PORT} \\
          -e sidekiq \'DATABASE_USERNAME\' ${DATABASE_USERNAME} \\
          -e sidekiq \'DATABASE_PASSWORD\' ${DATABASE_PASSWORD} \\
          -e sidekiq \'RAILS_MAX_THREADS\' ${RAILS_MAX_THREADS} \\
          -e sidekiq \'ENABLE_LINE_MANAGER_APPROVE\' ${ENABLE_LINE_MANAGER_APPROVE} \\
          -e sidekiq \'ENABLE_TRANSPORT_DESK_MANAGER_APPROVE\' ${ENABLE_TRANSPORT_DESK_MANAGER_APPROVE} \\
          -e sidekiq \'NO_SHOW_APPROVAL_REQUIRED\' ${NO_SHOW_APPROVAL_REQUIRED} \\
          -e sidekiq \'CALCULATE_ETA\' ${CALCULATE_ETA} \\
          -e sidekiq \'SEND_ANALYTICS_REPORT\' ${SEND_ANALYTICS_REPORT} \\
          -e sidekiq \'EMPLOYEE_ANDROID_APP_LINK\' ${EMPLOYEE_ANDROID_APP_LINK} \\
          -e sidekiq \'EMPLOYEE_IOS_APP_LINK\' ${EMPLOYEE_IOS_APP_LINK} \\
          -e sidekiq \'S3_BUCKET\' ${S3_BUCKET} \\
          -e sidekiq \'AUTO_APPROVE_TRIP_CHANGE_REQUEST\' ${AUTO_APPROVE_TRIP_CHANGE_REQUEST} \\
          -e sidekiq \'AUTO_APPROVE_TRIP_CANCEL_REQUEST\' ${AUTO_APPROVE_TRIP_CANCEL_REQUEST} \\
          -e sidekiq \'CHANGE_TIME_CHECK_IN\' ${CHANGE_TIME_CHECK_IN} \\
          -e sidekiq \'CHANGE_TIME_CHECK_OUT\' ${CHANGE_TIME_CHECK_OUT} \\
          -e sidekiq \'CANCEL_TIME_CHECK_IN\' ${CANCEL_TIME_CHECK_IN} \\
          -e sidekiq \'CANCEL_TIME_CHECK_OUT\' ${CANCEL_TIME_CHECK_OUT} \\
          -e sidekiq \'ONBOARD_PASSENGER_TIME\' ${ONBOARD_PASSENGER_TIME} \\
          -e sidekiq \'CLUSTERING_SERVICE_URL\' ${CLUSTERING_SERVICE_URL} \\
          -e sidekiq \'CLUSTER_ALGORITHM\' ${CLUSTER_ALGORITHM} \\
          -e sidekiq \'S3_HOST_NAME\' ${S3_HOST_NAME} \\
          -e sidekiq \'SITE_NAME\' ${SITE_NAME} \\
          -e sidekiq \'NEW_RELIC_license_key\' ${NEW_RELIC_license_key} \\
          -e sidekiq \'NEW_RELIC_app_name\' ${NEW_RELIC_app_name} \\
          -e sidekiq \'NEW_RELIC_log_level\' ${NEW_RELIC_log_level} \\
          -e sidekiq \'NEW_RELIC_monitor_mode\' ${NEW_RELIC_monitor_mode} \\
          -e sidekiq \'DRIVER_APP_LINK\' ${DRIVER_APP_LINK} \\
          -e db-migrate \'RAILS_ENV\' ${RAILS_ENV} \\
          -e db-migrate \'GMAIL_USENAME\' ${GMAIL_USENAME} \\
          -e db-migrate \'GMAIL_PASSWORD\' ${GMAIL_PASSWORD} \\
          -e db-migrate \'GOOGLE_MAPS_API_KEY\' ${GOOGLE_MAPS_API_KEY} \\
          -e db-migrate \'FCM_API_KEY\' ${FCM_API_KEY} \\
          -e db-migrate \'FCM_TOPIC_PREFIX\' ${FCM_TOPIC_PREFIX} \\
          -e db-migrate \'TWILIO_ACCOUNT_SID\' ${TWILIO_ACCOUNT_SID} \\
          -e db-migrate \'TWILIO_AUTH_TOKEN\' ${TWILIO_AUTH_TOKEN} \\
          -e db-migrate \'ANONYMOUS_APPLICATION_SID\' ${ANONYMOUS_APPLICATION_SID} \\
          -e db-migrate \'PLIVO_AUTH_ID\' ${PLIVO_AUTH_ID} \\
          -e db-migrate \'PLIVO_AUTH_TOKEN\' ${PLIVO_AUTH_TOKEN} \\
          -e db-migrate \'EXOTEL_SID\' ${EXOTEL_SID} \\
          -e db-migrate \'EXOTEL_TOKEN\' ${EXOTEL_TOKEN} \\
          -e db-migrate \'EXOTEL_CALLER_ID\' ${EXOTEL_CALLER_ID} \\
          -e db-migrate \'OPERATOR_NUMBER\' ${OPERATOR_NUMBER} \\
          -e db-migrate \'S3_ACCESS_KEY_ID\' ${S3_ACCESS_KEY_ID} \\
          -e db-migrate \'S3_SECRET_KEY\' ${S3_SECRET_KEY} \\
          -e db-migrate \'S3_BUCKET\' ${S3_BUCKET} \\
          -e db-migrate \'S3_REGION\' ${S3_REGION} \\
          -e db-migrate \'SERVER_URL\' ${SERVER_URL} \\
          -e db-migrate \'SECRET_KEY_BASE\' ${SECRET_KEY_BASE} \\
          -e db-migrate \'ROLLBAR_ACCESS_TOKEN\' ${ROLLBAR_ACCESS_TOKEN} \\
          -e db-migrate \'BASIC_AUTH_USER\' ${BASIC_AUTH_USER} \\
          -e db-migrate \'BASIC_AUTH_PASSWORD\' ${BASIC_AUTH_PASSWORD} \\
          -e db-migrate \'SOLUTIONS_INFINI_API_KEY\' ${SOLUTIONS_INFINI_API_KEY} \\
          -e db-migrate \'SOLUTIONS_INFINI_SENDER\' ${SOLUTIONS_INFINI_SENDER} \\
          -e db-migrate \'ENALBE_GUARD_PROVISIONGING\' ${ENALBE_GUARD_PROVISIONGING} \\
          -e db-migrate \'GEOHASH_AUTO_CLUSTERING\' ${GEOHASH_AUTO_CLUSTERING} \\
          -e db-migrate \'AUTO_CLUSTER\' ${AUTO_CLUSTER} \\
          -e db-migrate \'REDIS_URL\' ${REDIS_URL} \\
          -e db-migrate \'JOB_WORKER_URL\' ${JOB_WORKER_URL} \\
          -e db-migrate \'DATABASE_NAME\' ${DATABASE_NAME} \\
          -e db-migrate \'DATABASE_HOST\' ${DATABASE_HOST} \\
          -e db-migrate \'DATABASE_PORT\' ${DATABASE_PORT} \\
          -e db-migrate \'DATABASE_USERNAME\' ${DATABASE_USERNAME} \\
          -e db-migrate \'DATABASE_PASSWORD\' ${DATABASE_PASSWORD} \\
          -e db-migrate \'RAILS_MAX_THREADS\' ${RAILS_MAX_THREADS} \\
          -e db-migrate \'ENABLE_LINE_MANAGER_APPROVE\' ${ENABLE_LINE_MANAGER_APPROVE} \\
          -e db-migrate \'ENABLE_TRANSPORT_DESK_MANAGER_APPROVE\' ${ENABLE_TRANSPORT_DESK_MANAGER_APPROVE} \\
          -e db-migrate \'NO_SHOW_APPROVAL_REQUIRED\' ${NO_SHOW_APPROVAL_REQUIRED} \\
          -e db-migrate \'CALCULATE_ETA\' ${CALCULATE_ETA} \\
          -e db-migrate \'SEND_ANALYTICS_REPORT\' ${SEND_ANALYTICS_REPORT} \\
          -e db-migrate \'EMPLOYEE_ANDROID_APP_LINK\' ${EMPLOYEE_ANDROID_APP_LINK} \\
          -e db-migrate \'EMPLOYEE_IOS_APP_LINK\' ${EMPLOYEE_IOS_APP_LINK} \\
          -e db-migrate \'S3_BUCKET\' ${S3_BUCKET} \\
          -e db-migrate \'AUTO_APPROVE_TRIP_CHANGE_REQUEST\' ${AUTO_APPROVE_TRIP_CHANGE_REQUEST} \\
          -e db-migrate \'AUTO_APPROVE_TRIP_CANCEL_REQUEST\' ${AUTO_APPROVE_TRIP_CANCEL_REQUEST} \\
          -e db-migrate \'CHANGE_TIME_CHECK_IN\' ${CHANGE_TIME_CHECK_IN} \\
          -e db-migrate \'CHANGE_TIME_CHECK_OUT\' ${CHANGE_TIME_CHECK_OUT} \\
          -e db-migrate \'CANCEL_TIME_CHECK_IN\' ${CANCEL_TIME_CHECK_IN} \\
          -e db-migrate \'CANCEL_TIME_CHECK_OUT\' ${CANCEL_TIME_CHECK_OUT} \\
          -e db-migrate \'ONBOARD_PASSENGER_TIME\' ${ONBOARD_PASSENGER_TIME} \\
          -e db-migrate \'CLUSTERING_SERVICE_URL\' ${CLUSTERING_SERVICE_URL} \\
          -e db-migrate \'CLUSTER_ALGORITHM\' ${CLUSTER_ALGORITHM} \\
          -e db-migrate \'S3_HOST_NAME\' ${S3_HOST_NAME} \\
          -e db-migrate \'SITE_NAME\' ${SITE_NAME} \\
          -e db-migrate \'NEW_RELIC_license_key\' ${NEW_RELIC_license_key} \\
          -e db-migrate \'NEW_RELIC_app_name\' ${NEW_RELIC_app_name} \\
          -e db-migrate \'NEW_RELIC_log_level\' ${NEW_RELIC_log_level} \\
          -e db-migrate \'NEW_RELIC_monitor_mode\' ${NEW_RELIC_monitor_mode} \\
          -e db-migrate \'DRIVER_APP_LINK\' ${DRIVER_APP_LINK} \\
          -e location_service \'LOCATION_DATABASE_URL\' ${DATABASE_USERNAME}\':\'${DATABASE_PASSWORD}\'@tcp(\'${DATABASE_HOST}\':\'${DATABASE_PORT}\')/\'${DATABASE_NAME}\'?parseTime=true\' \\
          -e clustering_core \'CLUSTERING_DATABASE_URL\' ${DATABASE_USERNAME}\':\'${DATABASE_PASSWORD}\'@tcp(\'${DATABASE_HOST}\':\'${DATABASE_PORT}\')/\'${DATABASE_NAME}\'?parseTime=true\' \\
          --timeout 600 && echo "IMAGE Deployed"

          date +"%T"
          echo "Creating RDS SNAPSHOT for ${DB_INSTANCE_IDENTIFIER} as build-${CLIENT_BUILD_NUMBER} "

          #aws rds create-db-snapshot \\
          #--db-instance-identifier ${DB_INSTANCE_IDENTIFIER} \\
          #--db-snapshot-identifier \'${DB_INSTANCE_IDENTIFIER}\'-build-\'${CLIENT_BUILD_NUMBER}'''
      }
    }
  }
}
