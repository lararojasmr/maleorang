package com.ecwid.maleorang.method.v3_0.automation


import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.*
import com.ecwid.maleorang.method.v3_0.automation.info.WorkflowEmailQueue


/**
 * [Get information about automations](http://developer.mailchimp.com/documentation/mailchimp/reference/automations/emails/#read-get_automations_workflow_id_emails_workflow_email_id)
 */
@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/automations/{workflow_id}/emails/{workflow_email_id}/queue/{subscriber_hash}")
class GetQueueEmailAutomationMethod(

        @JvmField
        @PathParam
        val workflow_id: String,

        @JvmField
        @PathParam
        val workflow_email_id: String,

        @JvmField
        @PathParam
        val subscriber_hash: String

) : MailchimpMethod<WorkflowEmailQueue>()
