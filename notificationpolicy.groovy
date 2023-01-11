import org.apache.commons.lang.RandomStringUtils
#def notificationpolicy()

node {
    stage('Display Notifications Summary') {
        sh """curl --location --request GET 'https://api.opsgenie.com/v2/policies/notification?teamId=e27f4934-aa2f-41b4-ba2a-d149368285ac' --header 'Authorization: GenieKey 5b2c51fb-eaf2-4f3d-82a1-9138f356736d' > index.txt
            cat index.txt | jq -r '.data'
            """
    }
}

#return this
